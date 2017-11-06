--liquibase formatted sql
--changeset nvoxland:1
create table employees (
    id int primary key,
    name varchar(255)
);
--changeset nvoxland:2 runOnChange:true
insert into employees (id, name) values (1, 'dev');
insert into employees (id, name) values (2, 'ops');
