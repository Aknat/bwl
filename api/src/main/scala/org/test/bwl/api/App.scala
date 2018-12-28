package org.test.bwl.api

import akka.http.scaladsl.server.HttpApp
import org.test.bwl.api.auth.BasicAuth
import org.test.bwl.api.route.ApiRoute

object App extends HttpApp with BasicAuth with ApiRoute {

  def main(args: Array[String]): Unit =
    startServer("127.0.0.1", port = 8080)
}