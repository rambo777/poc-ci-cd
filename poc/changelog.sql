--liquibase formatted sql

--changeset nvoxland:4 runOnChange:true
insert into employeesrishi (id, name) values (3, 'db');
insert into employeesrishi (id, name) values (4, 'dbrishi');
