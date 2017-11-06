--liquibase formatted sql
--changeset nvoxland:1
create table employees (
    id int primary key,
    name varchar(255)
);
--changeset nvoxland:2 runOnChange:true
insert into employees (id, name) values (1, 'dev');
insert into employees (id, name) values (2, 'ops');

--changeset nvoxland:3
create table employeesrishi (
    id int primary key,
    name varchar(255)
);
--changeset nvoxland:4 runOnChange:true
insert into employeesrishi (id, name) values (1, 'dev');
insert into employeesrishi (id, name) values (2, 'ops');
