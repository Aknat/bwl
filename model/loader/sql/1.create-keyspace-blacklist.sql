DROP KEYSPACE IF EXISTS blacklist_dict;

CREATE KEYSPACE blacklist_dict
WITH REPLICATION = { 'class': 'SimpleStrategy', 'replication_factor' : 2 };