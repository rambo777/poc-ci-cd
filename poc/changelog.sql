--liquibase formatted sql
--changeset nvoxland:1
create table employees (
    id int primary key,
    name varchar(255)
);

