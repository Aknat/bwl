USE bwl_dict;

DROP TABLE IF EXISTS black_list_rules ;

CREATE TABLE black_list_rules (
 msisdn BIGINT PRIMARY KEY,
 shortNumbers SET<TEXT>
);