package org.test.bwl.model.conf

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.test.bwl.model
import org.test.bwl.model.dao.BlackListRule

import scala.collection.JavaConverters._

@RunWith(classOf[JUnitRunner])
class DBTest extends model.Config with DB {

  s"The DB subsystem"should {

    s"1. Get BleckListRule" in {

      val expected = BlackListRule(380670000001L, Set("777", "bigtits").asJava)
      val actual = blackListRuleAccessor

    }
  }
}