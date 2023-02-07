-- liquibase formatted sql
-- changeset alexust11:1
CREATE TABLE users (
    id SERIAL,
    email TEXT
) ;
--changeset alexust11:2
ALTER TABLE users ADD COLUMN name TEXT;

--changeset alexust11:3
CREATE INDEX users_name_index ON users (name);

