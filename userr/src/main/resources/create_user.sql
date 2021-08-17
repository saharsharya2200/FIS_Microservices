create database ormlearn

create table role (ro_id int, ro_name varchar(20))
create table user (us_id int, us_username varchar(20), us_password varchar(20))

create table user_role(ur_ro_id int, ur_us_id int)
create table skill(sk_id int, sk_name varchar(20))


create table department(dp_id int, dp_name varchar(20))

create table employee_skill (es_em_id int, es_sk_id int)

create table employee(em_id int, em_name varchar(20), em_salary double precision, em_permanent bit(1), em_date_of_birth datetime(6), em_dp_id int)


use ormlearn;
insert into employee values(2, "Random Name", 878787, 1, "1999/05/21 11:22:32.2222222",44)
insert into department values(44, "Social science")
insert into employee_skill values(100, 200)
insert into employee_skill values(390, 400)
insert into role values(1000, "developer");
insert into role values(10001, "Tester");

insert into skill values (2000, "HTML");
insert into skill values (2001, "Java");

insert into user values(5000, "user1", "random");
insert into user values(5000, "user2", "random2");

insert into user_role values(90,91);
insert into user_role values(92,93);
