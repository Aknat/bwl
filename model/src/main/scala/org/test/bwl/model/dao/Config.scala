package org.test.bwl.model.dao

import com.datastax.driver.mapping.annotations.{PartitionKey, Table}

@Table(keyspace = "bwl_dict", name = "configs", readConsistency = "ONE", writeConsistency = "ONE")
case class Config(@PartitionKey key: String, value: String) {
  def this() = this(null, null)
}