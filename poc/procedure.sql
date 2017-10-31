DROP PROCEDURE IF EXISTS sayHelloWorld;
#
CREATE PROCEDURE sayHelloWorld()
BEGIN
    SELECT 'Hello World From a Liquibase!';
END
#
