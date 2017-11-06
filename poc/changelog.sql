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
drop table employeerishi,addressdetails,emp;


--changeset nvoxland:4 runOnChange:true
insert into employeerishi (empId) values (3);
insert into employeerishii (empId) values (4);

