create user Employee identified by employee;
grant all privileges to Employee;
grant create session to Employee;
grant unlimited tablespace to Employee;
connect Employee/employee;

create table Employee_details
   (
    emp_id number(4),
    emp_name varchar2(20),
    job_name varchar2(20),
    manager_id number(3),
    salary number(6),
    hire_date date,
    dep_id number(5)
   );
insert into Employee_details values(101,'John','salesman',221,25000,'01-aug-2008',6666);
insert into Employee_details values(105,'Katherine','Administrator',128,35000,'01-may-2009',1111);
insert into Employee_details values(265,'Raj','Manager',432,60000,'01-jun-2006',5555);
insert into Employee_details values(224,'Ravi','Developer',567,80000,'01-jul-2016',5555);
insert into Employee_details values(301,'Jyothi','Receptionist',654,30000,'01-jan-2021',6666);
insert into Employee_details values(225,'Karthik','Technician',643,30000,'01-mar-2017',1111);
insert into Employee_details values(134,'Krithi','Tester',654,50000,'01-apr-2011',5555);
insert into Employee_details values(564,'Krishna','Developer',567,50000,'01-nov-2010',7777);
insert into Employee_details values(496,'Rama','Tester',643,50000,'01-oct-2013',1111);
insert into Employee_details values(390,'Raju','Technician',666,20000,'01-apr-2011',6666);

select salary from Employee_details;

select unique(job_name) from Employee_details;

update Employee_details set salary=30000 where emp_name ='Raj';

create user football identified by foot;
grant all privileges to football;
grant create session to football;
grant create table to football;
create table football_venue
   (
   venue_id number(2),
   venue_name varchar2(20),
   city_id number(3),
   capacity number(7)
  );
insert into football_venue values(12,'Tokyo',347,50000);
insert into football_venue values(11,'Arizona',546,30000);
insert into football_venue values(06,'Nairobi',766,33423);
insert into football_venue values(03,'Rio',454,46234);
insert into football_venue values(14,'Denver',678,24000);
insert into football_venue values(54,'Delhi',691,25000);
insert into football_venue values(65,'Australia',121,30000)
insert into football_venue values(76,'France',165,35000);
insert into football_venue values(43,'London',148,25000);
insert into football_venue values(55,'Turkey',148,28000);
select count(unique(venue_name)) from football_venue;
select venue_name as location,capacity as volume from football_venue;
delete from football_venue where venue_name='Australia';

