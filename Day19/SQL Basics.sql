 e-- to create a database and table in database
create database java;

-- (use) keyword for using the database name
use java;

-- to create a table of columns that store in that database
create table concepts(
Oops varchar(50),
Program int primary key,
levels varchar(20),
marksoflevels decimal(4,2)
);

-- to show the table we use describe
describe concepts;

-- for add the extra column and remove the column we use add and drop 
alter table concepts add username varchar(50);
alter table concepts drop Oops ;

alter table concepts add Oops varchar(50);

-- to rename the column to new name
alter table concepts rename column username to userid;

-- to rename the table name using rename to without giving column
alter table concepts rename to Programming_Language;

-- using drop we can drop the table that is deleted
drop table Programming_Language;

-- to delete the database using drop
drop database java;

create database mec;
use mec;
create table cse(
rno int primary key,
name varchar(20),
cgpa decimal(3,2),
pdate date,
abc time,
pout year,
aano int unique,
gender varchar(7) not null
);

-- we are giving the values to each column
insert into cse value(1,'Abi',8.25,'2025-12-12','11:11:11',2025,123,'Male');
describe cse;

-- giving another values to each column
insert into cse value(2,'Aishu',8.25,'2025-12-12','11:11:11',2025,1234,'Male');

-- to see the data using select
select * from cse;


-- we are giving the values in one time
insert into cse
value(3,'Abitha',8.25,'2025-12-12','11:11:11',2025,1277,'Male'),(4,'Anu',8.25,'2025-12-12','11:11:11',2025,1345,'Male');
insert into cse value(6,'Vaasu',8.25,'2025-12-12','11:11:11',2025,1884,'Male');

-- insert the values in the particular column
insert into cse(rno,name,aano,gender) value(8,'Selva',3455,'Male');
insert into cse(rno,cgpa,aano,gender) value(9,9.0,3955,'Male');

-- delete the particular column
alter table cse drop pdate;
alter table cse drop abc;
alter table cse drop aano;
alter table cse drop pout;
select *from cse;

-- alter the table to add the dept
alter table cse add dept varchar(10);

-- we can see the table who is all are male
select *from cse where gender = 'Male';

-- update the column without sql safe is off
update cse set dept = 'IT';

-- we were update the safe mode off and execute the update and it update all the row that is not safe
set sql_safe_updates = 1;

-- update using the particular rollno
update cse set dept = 'IT' where rno=1;

-- update cgpa using where rollno
update cse set cgpa = 9.05 where rno = 6;

-- using particular value we can update whatever using where class
update cse set dept = 'ECE' where rno not in (1,3,5,7);
update cse set dept = 'EEE' where rno in (1,3,5,7);
update cse set name = 'Aishu' where rno = 2;
update cse set gender = 'Female' where rno in (1,2,3,4);
update cse set name = 'Abi' where rno=1;
update cse set dept = 'CSE' where rno in (1,2,3,4);
update cse set cgpa = 8.5 where rno = 8;
update cse set name = 'Ragul' where rno = 9;

-- to delete the entire values in the table
TRUNCATE TABLE CSE;

create table IT(
rno int,
name varchar(10),
mark int
);

-- This is for executing ascending and descending order and priority
 SELECT * FROM IT;
 
 insert into IT value(1,'Abi',90),(2,'Aishu',100),(3,'Abitha',95),(4,'Vasanth',99),(5,'Anu',60),(6,'Selva',50);
 
 -- To execute by ascending order
 select * from IT order by mark;
 
 -- to execute in descending order
 select *from IT order by mark desc;
 
 -- To execute the value by the limit 
 select *from IT order by mark desc limit 3;
 
 -- it executes as priority and we dont want to give comma inbetween the condition
 select *from IT order by (case mark when 100 then 1
 when 0 then 2
 when 95 then 3
 else 3 end);
 
 -- This executes the continent as this much time like this
 use world;
 select *from country;
 
 -- it shows the particular continent have how many countries
 select continent,count(continent) from country group by continent;
 select continent,count(continent) from country group by continent;

create database javafullstack;
use javafullstack;
create table employee(
empid int primary key,
name varchar(20),
dept varchar(15),
salary int);

-- this executes the partiular column values
select *from employee;
insert into employee values(1,'Alice','HR',50000),(2,'Bob','IT',60000),(3,'Carol','IT',75000),(4,'David','Finance',70000),(5,'Eve','HR',52000);

-- to order ascending order we use order by and for descending order use use desc in last
select * from employee where salary between 50000 and 60000 order by salary;