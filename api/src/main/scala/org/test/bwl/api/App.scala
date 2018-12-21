package org.test.bwl.api

import akka.http.scaladsl.server.HttpApp
import org.test.bwl.api.Auth.BasicAuth
import org.test.bwl.api.route.ApiRoute

object App extends HttpApp with BasicAuth with ApiRoute {

  def main(args: Array[String]): Unit = {
    startServer("127.0.0.1", port = 8080)

    // println(conf.getList("client.db.contact.points"))
    // println(session.getState.getConnectedHosts)
    // println(">>>" + ConfigAccessor.getAll.all)
    // println(">>>" + configAccessor.getAll.all)
    // println(configs.getString("validation.msisdn.length.min"))
    // println(">>>" + userAccessor.getAll.all)
    // println(">>>" + userAccessor.getAll.all)
    // println(users.get("test-c"))
    // complete("Hello Akka!")
    // GET http:127.0.0.1:8080/api/rules/${msisdn}/


    // GET http:127.0.0.1:8080/api/pass?msisdn=${msisdn}&sn=$(sn)
  }


}