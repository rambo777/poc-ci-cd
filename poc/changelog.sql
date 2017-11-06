--liquibase formatted sql
--changeset nvoxland:1
create table employee (
    id int primary key,
    name varchar(255)
);

