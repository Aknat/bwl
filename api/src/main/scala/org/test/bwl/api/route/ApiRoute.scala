package org.test.bwl.api.route

import akka.http.scaladsl.model.HttpEntity
import akka.http.scaladsl.model.MediaTypes.`application/json`
import org.test.bwl.api.Auth.BasicAuth
import org.test.bwl.model.conf.DB

trait ApiRoute extends BasicAuth with DB {

   def routes = pathPrefix("api" / "pass") {

    get {

      withBasicAuth {

        parameters('msisdn.as[Long], 'sn) { (msisdn, sn) =>

          val rule = blackListRuleAccessor.get(msisdn).one
          val pass = !rule.shortNumbers.contains(sn)

          complete(HttpEntity(`application/json`, s"""{"passed":$pass}"""))

        }
      }
    }
  }

}
