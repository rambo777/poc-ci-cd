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
create table employeerishi (empId int);
create table addressdetails (empId int);
create tables emp (empId int);
--rollback drop table employeerishi,addressdetails;





