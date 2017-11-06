--liquibase formatted sql

--changeset nvoxland:4 runOnChange:true
insert into employeesrishi (id, name) values (1, 'db');
insert into employeesrishi (id, name) values (2, 'dbrishi');
