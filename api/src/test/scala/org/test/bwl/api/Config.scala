package org.test.bwl.api

import akka.http.scaladsl.model.headers.BasicHttpCredentials
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}
import org.test.bwl.api.route.ApiRoute

trait Config extends WordSpec with Matchers with ScalatestRouteTest with ApiRoute {

  val validClientCredentials = BasicHttpCredentials("test-client", "test-client-password")

}
