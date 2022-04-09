select distinct subjectname from subject where deptcode='CSE' and semester='SEM5';

select rollno from results where marks>60 and marks<=70 and sub_code='CS501';

select address from student where rollno=1001;

UPDATE student
SET address = 'kaikhali, VIPROAD, Kolkata'
WHERE rollno=1001;

select address from student where rollno=1001;

update department set STUDENTALLOTED=75 where deptcode='IT';

select * from department where deptcode='IT';

update department set STUDENTALLOTED= STUDENTALLOTED + 75 where deptcode='CSE';

select * from department where deptcode='CSE';

update results set marks=marks + 5 where sub_code='CS302';

update student set phoneno = '999999999' where deptcode='CSE' and semester='SEM5' and phoneno is NULL;

select * from results where marks < passmarks;

update results set marks = marks + 2 where marks < passmarks and sub_code like 'CS%' and marks >= passmarks - 2;

delete student where rollno = 2004;

select name, deptcode, semester from student where yearofadm < 2017 order by name asc;

select rollno, sub_code from results where marks > 90 and sub_code='CS301' or sub_code= 'CS302';

insert into student values (9002, 'Aniruddha', 'Birati, Kolkata', 9007823701, 2020, 'CSE', 'SEM5', '22-MAR-2001');

insert into student values (9003, 'Archan', 'Chandannagar, Kolkata', 9117823701, 2020, 'CSE', 'SEM5', '22-MAR-2001');

update student set phoneno = null where rollno=9003;

select rollno, sub_code from results where marks > passmarks + 40 and sub_code = 'CS501' or sub_code = 'CS502';


