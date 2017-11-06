--liquibase formatted sql

--changeset ranjit:5 endDelimiter:# runOnChange:true
DROP PROCEDURE IF EXISTS sayHelloWorld;
#
CREATE PROCEDURE sayHelloRishi()
BEGIN
    SELECT ' Hello :) Liquibase!';
END
#
--changeset nvoxland:6 runOnChange:true
drop table employeerishi,addressdetails;
create table employeerishi (empId int);
create table addressdetails (empId int);
create table emp (empId int);

--changeset nvoxland:4 runOnChange:true
insert into employeerishi (id, name) values (3, 'db');
insert into employeerishii (id, name) values (4, 'dbrishi');

