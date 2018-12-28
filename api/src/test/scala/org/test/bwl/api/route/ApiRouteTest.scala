package org.test.bwl.api.route

import akka.http.scaladsl.model.StatusCodes._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.test.bwl.api.Config

@RunWith(classOf[JUnitRunner])
class ApiRouteTest extends Config {

  val uri = "/api/pass"

  s"The hash system with REST resource $uri" should {

    s"7. Return OK code with right body for GET requests to $uri with valid credentials" in {

      Get(s"$uri?msisdn=380672330768&sn=777") ~>
        addCredentials(validClientCredentials) ~>
        routes ~> check {

        status shouldEqual OK
        entityAs[String] should include ("false")
      }
    }
  }
}