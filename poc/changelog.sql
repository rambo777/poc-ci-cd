--liquibase formatted sql

--changeset nvoxland:4 runOnChange:true
insert into employeesrishi (id, name) values (3, 'db');
insert into employeesrishi (id, name) values (4, 'dbrishi');

--changeset ranjit:5 endDelimiter:# runOnChange:true
DROP PROCEDURE IF EXISTS sayHelloWorld;
#
CREATE PROCEDURE sayHelloRishi()
BEGIN
    SELECT ' Hello :) Liquibase!';
END
#
--changeset nvoxland:6 runOnChange:true
--rollback drop table employeerishi,addressdetails;
drop table employeerishi,addressdetails;
create table employeerishi (empId int);
create table addressdetails (empId int);
create tables emp (empId int);


