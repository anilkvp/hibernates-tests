DROP DATABASE IF EXISTS hibernate_tests;

CREATE DATABASE hibernate_tests;

DROP USER IF EXISTS 'ht_user'@'localhost';

CREATE USER 'ht_user'@'localhost' IDENTIFIED BY 'Test@123';

GRANT ALL PRIVILEGES ON hibernate_tests. * TO 'ht_user'@'localhost';

FLUSH PRIVILEGES;

USE hibernate_tests;


-- // Tables for one to many mapping unidirectional  starts here // --

DROP TABLE IF EXISTS user;
CREATE TABLE user (
    id INT NOT NULL PRIMARY KEY,
    username VARCHAR(100) not null,
    firstname VARCHAR(100) not null,
    lastname VARCHAR(100) not null,
    password VARCHAR(100) not null,
    email VARCHAR(100)
);

DROP TABLE IF EXISTS address;
CREATE TABLE adderss (
    id INT NOT NULL PRIMARY KEY,
    address1 VARCHAR(100),
    address2 VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(100),
    country VARCHAR(100),
    postalCode VARCHAR(100),
    user_id INT NOT NULL,
    CONSTRAINT fk_key_uid
    FOREIGN KEY fk_user_id(user_id)
    REFERENCES user(id)
);

-- // Tables for one to many mapping unidirectional  ends here // --