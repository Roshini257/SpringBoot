

--  DDL command to create this table
create table Employee(
first_name varchar(60),
last_name varchar(60),
job_start_date date,
salary integer
);

drop table Employee;
-- DDL command to add a new column "department"
alter table Employee add department varchar(60);
insert into Employee 
values('rishika','cheruku','2023/07/13','70','java');
insert into Employee 
values('sanjana','ravula','2023/07/14','80','java');
insert into Employee 
values('roshini','racha','2023/07/10','75','devops');
insert into Employee 
values('rashmitha','reddy','2023/07/12','65','salesforce');
insert into Employee 
values('sangamithra','sangu','2023/07/05','60','java');

select * from Employee;

-- SQL query to find the highest salary from an "Employee" table.

select max(salary) from Employee;
select * from Employee where salary=(select max(salary) from Employee);

insert into Employee 
values('srividya','chada','2023/01/05','60','java');
insert into Employee 
values('rama','devi','2023/02/15','65','devops');
insert into Employee 
values('punnu','kandi','2023/04/25','76','salesforce');

-- to find all the employees who joined in the last 6 months;
select * from Employee Where job_start_date>=date_sub(curdate(),interval 6 month);

-- display number of employees in each department.
select department,count(*) from Employee group by department; 
set foreign_key_checks=0;
set global foreign_key_checks=0;
-- inserting values in consultant_details
select * from consultant_detail;
insert into consultant_detail values('C1','L1','manohar','reddy','manoharreddy@gmail.com','4567965432');
insert into consultant_detail values('C2','L2','kranthi','reddy','kranthireddy@gmail.com','4567965562');

-- update email_address on the consultant_detail table
update consultant_detail set email_address='mreddy@gmail.com' where id='C1';

select * from submissions;
insert into submission values
('s1','C1','2023/06/15','teksystems','nick','n@gmail.com','9087654532','tek','infor','65','submitted','dallas','tx','75069');
insert into submission values
('s2','C1','2023/06/16','cis','sai','s@gmail.com','9086754532','kesh','amazon','70','submitted','raleigh','nc','70596');
insert into submissions values
('s3','C2','2023/06/16','cis','adil','a@gmail.com','9046754532','noble','infi','75','submitted','kansas city','mo','70346');
delete from submissions where id='s3';
-- total number of submissions for each constulant.
SELECT c.id, c.id, COUNT(s.id) AS total_submissions
FROM consultant_detail c
JOIN submission s ON c.id = s. consultant_id
GROUP BY c.id, c.first_name;

--  total number of submissions for each constulant by each submission day
SELECT c.id, c.id, COUNT(s.id) AS total_submissions
FROM consultant_detail c
JOIN submission s ON c.id = s. consultant_id
GROUP BY c.id, c.first_name,s.submissiondate;
--
insert into submission (id,consultant_id,submissiondate,vendor_name,vendor_email_address,vendor_phone_number,implementation_partner,client_name,submission_status,city,state,zip)
values ('s4','C2','2023/03/16','cs','shiv','sh@gmail.com','9046654532','rock','fix','submitted','kansas','mo','70346');

insert into submission (id,consultant_id,submissiondate,vendor_company,vendor_name,vendor_email_address,vendor_phone_number,implementation_partner,client_name,submission_status,city,state,zip)
values ('S4','C2','2023/03/16','cs','shiv','sh@gmail.com','9046654532','rock','fix','submitted','kansas','mo','70346');

select * from submission;

--  delete all submissions where "rate" is null

DELETE s1
FROM submission AS s1
JOIN submission AS s2 ON s1.id = s2.id
WHERE s2.pay_rate IS NULL;

select * from lead_detail;
insert into lead_detail values ('L1','tejan','reddy','treddy@gmail.com','9056342176');
insert into lead_detail values ('L2','praveen','r','praveenr@gmail.com','9056352176');

-- lead name and submission date, Write a SQL query to find the submissions.
select s.*
from submission s
join consultant_detail c on c.id=s.Consultant_id
join lead_detail l on l.id=c.lead_id
where l.first_name="Tejan"and Submissiondate="2023-06-15";
 
 -- find the number of submissions by each lead.
 
SELECT l.first_name, l.last_name, COUNT(*) AS Count
FROM submission s
join consultant_detail c on c.id=s.consultant_id
join lead_detail l on l.id=c.lead_id
GROUP BY l.first_name, l.last_name;



select * from consultant_details;