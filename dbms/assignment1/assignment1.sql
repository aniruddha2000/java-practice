SELECT * FROM DEPARTMENT;

SELECT * FROM DEPARTMENT WHERE STUDENTALLOTED > 100;

SELECT * FROM STUDENT WHERE DEPTCODE = 'CSE';

SELECT NAME,DEPTCODE,SEMESTER FROM STUDENT WHERE YEAROFADM = 2018;

SELECT NAME,SEMESTER FROM STUDENT WHERE DEPTCODE='CSE' AND PHONENO IS NULL;

SELECT NAME,PHONENO FROM STUDENT WHERE NAME LIKE 'R%';

SELECT NAME,PHONENO FROM STUDENT WHERE NAME LIKE '%KUMAR';

Select name,yearofadm,deptcode from student where name like '_A%';

SELECT * FROM STUDENT WHERE ADDRESS LIKE '%Kolkata' and deptcode='CSE' and BIRTHDATE < '01-01-00';

SELECT * FROM STUDENT WHERE SEMESTER='SEM3' AND SEMESTER='SEM4' AND BIRTHDATE LIKE '01%';

SELECT * FROM STUDENT WHERE DEPTCODE='IT' AND ADDRESS LIKE '%Kolkata' AND YEAROFADM=2017;

SELECT PHONENO,YEAROFADM,BIRTHDATE FROM STUDENT WHERE BIRTHDATE LIKE '___06%';

SELECT * FROM STUDENT WHERE DEPTCODE='ECE' AND (SEMESTER='SEM5' OR SEMESTER='SEM6') AND BIRTHDATE LIKE '20-10%';

SELECT * FROM STUDENT WHERE BIRTHDATE LIKE '___05%' OR BIRTHDATE LIKE '___06%' OR BIRTHDATE LIKE '___09%' OR BIRTHDATE LIKE '___12%';

SELECT NAME,DEPTCODE,SEMESTER FROM STUDENT WHERE BIRTHDATE < '01-01-00';
