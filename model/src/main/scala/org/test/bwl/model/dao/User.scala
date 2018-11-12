package org.test.bwl.model.dao

import com.datastax.driver.mapping.annotations.{PartitionKey, Table}

@Table(keyspace = "bwl_dict", name = "users", readConsistency = "ONE", writeConsistency = "ONE")
case class User(@PartitionKey id: String, login: String, password: String, allowedIp: Set[String], roles: Set[String]) {
  def this() = this(null, null, null, null, null)
}
