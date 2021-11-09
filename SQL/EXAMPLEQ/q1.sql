-- create table tens like all_students;
insert into tens 
select * from all_students where grade='10';