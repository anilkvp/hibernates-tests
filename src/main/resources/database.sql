DROP DATABASE IF EXISTS hibernate_tests;

CREATE DATABASE hibernate_tests;

DROP USER IF EXISTS 'ht_user'@'localhost';

CREATE USER 'ht_user'@'localhost' IDENTIFIED BY 'Test@123';

GRANT ALL PRIVILEGES ON hibernate_tests. * TO 'ht_user'@'localhost';

FLUSH PRIVILEGES;

USE hibernate_tests;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
    id INTEGER NOT NULL PRIMARY KEY,
    username VARCHAR(255) not null,
    firstname VARCHAR(255) not null,
    lastname VARCHAR(255) not null,
    password VARCHAR(255) not null,
    email VARCHAR(255)
)
