package org.test.bwl.model.dao

import com.datastax.driver.mapping.Result
import com.datastax.driver.mapping.annotations.{Accessor, PartitionKey, Query, Table}

@Accessor trait BlackListRuleAccessor {
  @Query("SELECT * FROM bwl_dict.black_list_rules WHERE msisdn = :msisdn") def get(msisdn: Long): Result[BlackListRule]
}

@Table(keyspace = "bwl_dict", name = "black_list_rules", readConsistency = "ONE", writeConsistency = "ONE")
case class BlackListRule(@PartitionKey msisdn: Long, shortNumbers: java.util.Set[String]) {
  def this() = this(null.asInstanceOf[Long], null)
}