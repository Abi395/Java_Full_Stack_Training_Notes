use cse;
create table mec(
rollno int primary key,
name varchar(20),
mark int);

-- inserting the values
insert into mec values(1,'Abi',85),(2,'Aishu',99),(3,'Abitha',90),(4,'Vaasu',100),(5,'Selva',78),(6,'Anu',50);

-- print the total values using sum
select sum(mark) from mec;

-- Execute the mark that one person got more than 90 have an using mark>90 and limit 
select * from mec where mark>95 limit 1; 

-- print the total average
select avg(mark) from mec;

-- to count the persons that present
select count(name) from mec;

-- to execute the maximum mark in the table
select max(mark) from mec;

-- to execute the minimum mark in the table
select min(mark) from mec;