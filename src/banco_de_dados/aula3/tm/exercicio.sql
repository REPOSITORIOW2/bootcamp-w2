CREATE USER 'ml_app_user1'@'localhost' IDENTIFIED BY 'ml_app_user1';

mysql> CREATE DATABASE ml_app_consultorio2;
ERROR 1044 (42000): Access denied for user 'ml_app_user1'@'localhost' to database 'ml_app_consultorio2'

mysql> DROP DATABASE ml_app_consultorio;
ERROR 1044 (42000): Access denied for user 'ml_app_user1'@'localhost' to database 'ml_app_consultorio'

CREATE USER 'ml_app_user2'@'localhost' IDENTIFIED BY 'ml_app_user2';
GRANT ALL PRIVILEGES ON * . * TO 'ml_app_user2'@'localhost';

mysql> SHOW GRANTS FOR 'ml_app_user2'@'localhost';
+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Grants for ml_app_user2@localhost                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, RELOAD, SHUTDOWN, PROCESS, FILE, REFERENCES, INDEX, ALTER, SHOW DATABASES, SUPER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, REPLICATION SLAVE, REPLICATION CLIENT, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, CREATE USER, EVENT, TRIGGER, CREATE TABLESPACE, CREATE ROLE, DROP ROLE ON *.* TO `ml_app_user2`@`localhost`                                                                                                                                                                                                                    |
| GRANT APPLICATION_PASSWORD_ADMIN,AUDIT_ADMIN,BACKUP_ADMIN,BINLOG_ADMIN,BINLOG_ENCRYPTION_ADMIN,CLONE_ADMIN,CONNECTION_ADMIN,ENCRYPTION_KEY_ADMIN,FLUSH_OPTIMIZER_COSTS,FLUSH_STATUS,FLUSH_TABLES,FLUSH_USER_RESOURCES,GROUP_REPLICATION_ADMIN,INNODB_REDO_LOG_ARCHIVE,INNODB_REDO_LOG_ENABLE,PERSIST_RO_VARIABLES_ADMIN,REPLICATION_APPLIER,REPLICATION_SLAVE_ADMIN,RESOURCE_GROUP_ADMIN,RESOURCE_GROUP_USER,ROLE_ADMIN,SERVICE_CONNECTION_ADMIN,SESSION_VARIABLES_ADMIN,SET_USER_ID,SHOW_ROUTINE,SYSTEM_USER,SYSTEM_VARIABLES_ADMIN,TABLE_ENCRYPTION_ADMIN,XA_RECOVER_ADMIN ON *.* TO `ml_app_user2`@`localhost` |
+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+

CREATE USER 'ml_app_user3'@'localhost' IDENTIFIED BY 'ml_app_user3';
GRANT SELECT ON ml_app_consultorio.* TO 'ml_app_user3'@'localhost';


mysql> SHOW GRANTS FOR 'ml_app_user3'@'localhost';
+----------------------------------------------------------------------+
| Grants for ml_app_user3@localhost                                    |
+----------------------------------------------------------------------+
| GRANT USAGE ON *.* TO `ml_app_user3`@`localhost`                     |
| GRANT SELECT ON `ml_app_consultorio`.* TO `ml_app_user3`@`localhost` |
+----------------------------------------------------------------------+
