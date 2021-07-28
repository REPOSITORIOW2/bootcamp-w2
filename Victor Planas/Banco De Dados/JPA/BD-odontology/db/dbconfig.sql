CREATE DATABASE `ml_app_consultorio`
COLLATE 'utf8_spanish_ci';

CREATE USER 'ml_app_user1'@'localhost' IDENTIFIED BY 'ml_app_user1';

GRANT
    INSERT, SELECT, UPDATE , DELETE,
    INDEX, ALTER, CREATE, CREATE TEMPORARY TABLES, CREATE VIEW, REFERENCES
        on ml_app_consultorio.* TO 'ml_app_user1'@'localhost';

CREATE USER 'ml_app_user2'@'localhost' IDENTIFIED BY 'ml_app_user2';

GRANT ALL PRIVILEGES ON ml_app_consultorio.* TO 'ml_app_user2'@'localhost';

CREATE USER 'ml_app_user3'@'localhost' IDENTIFIED BY 'ml_app_user3';

GRANT SELECT ON ml_app_consultorio.* TO 'ml_app_user3'@'localhost';

CREATE USER 'ml_app_user4'@'%' IDENTIFIED BY 'ml_app_user4';

GRANT ALL PRIVILEGES ON ml_app_consultorio.* TO 'ml_app_user4'@'%';