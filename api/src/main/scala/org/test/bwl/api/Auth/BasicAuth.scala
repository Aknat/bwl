package org.test.bwl.api.Auth

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives
import akka.http.scaladsl.server.directives.Credentials
import akka.http.scaladsl.server.directives.Credentials.Provided
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import org.test.bwl.model.dao.User

trait BasicAuth extends Directives {

  def users: Map[String, User]

  def userPassAuthenticator(credentials: Credentials) = credentials match {

    case p @Provided(login) => Future {
      users.get(login).filter(user => p.verify(user.password))
    }
    case _ => Future.successful(None)
  }

  def withBasicAuth(f: => Route): Route =

    authenticateBasicAsync("bwl", userPassAuthenticator) { user =>
      f
    }
}
