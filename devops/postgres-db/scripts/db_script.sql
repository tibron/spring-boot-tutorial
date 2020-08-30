CREATE DATABASE spdb;
\c spdb
CREATE TABLE sp_Persons ( PersonID  int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255));
INSERT INTO sp_Persons (PersonID,LastName,FirstName,Address,City) VALUES (1,'First','User','str.123','Berlin');
INSERT INTO sp_Persons (PersonID,LastName,FirstName,Address,City) VALUES (2,'Second','User','str.222','Hamburg');
INSERT INTO sp_Persons (PersonID,LastName,FirstName,Address,City) VALUES (3,'Third','Name','Bridge','Frankfurt');
