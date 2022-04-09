ALTER TABLE student ADD foreign key (deptcode) references department(deptcode);


ALTER TABLE department ADD block varchar2(5);


UPDATE department SET block='C' WHERE deptcode='CSE';
UPDATE department SET block ='C' WHERE deptcode='IT';
UPDATE department SET block ='B' WHERE deptcode='EE' OR deptcode='ECE';


ALTER TABLE subject MODIFY subjectcode varchar2(8);


ALTER TABLE subject DROP primary key;
SELECT CONSTRAINT_NAME,CONSTRAINT_TYPE,SEARCH_CONDITION FROM user_constraints WHERE table_name = 'SUBJECT';


ALTER TABLE subject ADD primary key(subjectcode);


ALTER TABLE result ADD foreign key(sub_code) references subject(subjectcode);


ALTER TABLE result MODIFY marks CHECK (marks>=0);


ALTER TABLE student MODIFY deptcode CHECK(deptcode='CSE' OR deptcode='IT' OR deptcode='ECE' OR deptcode='MCA' OR deptcode='EE');


ALTER TABLE student ADD collegephone number(10);
UPDATE student SET collegephone=25739607;


CREATE TABLE Faculty (
    FID VARCHAR2(4) CHECK (fid LIKE 'F%'),
    Name varchar2(20)
);


INSERT INTO Faculty VALUES('F01','Aloke Kumar Dutta');
INSERT INTO Faculty VALUES('F02','Abhijit Roy');
INSERT INTO Faculty VALUES('F03','Probal Kumar');
INSERT INTO Faculty VALUES('F04','Mousumi Dey');
INSERT INTO Faculty VALUES('F05','Sharmistha Nag');
INSERT INTO Faculty VALUES('F06','Dipty Bhattacharya');
INSERT INTO Faculty VALUES('F07','Sanjay Kumar Das');
INSERT INTO Faculty VALUES('F08','Partha Pratim Ba');
INSERT INTO Faculty VALUES('F09','Rakesh Chouhan');
INSERT INTO Faculty VALUES('F10','Srija Paul');


ALTER TABLE Subject ADD PASSMARKS NUMBER(3);

UPDATE Subject
SET PASSMARKS=40
WHERE SubjectCode in ('CS301', 'CS302', 'CS501', 'CS502', 'CS503', 'EC501');

Update Subject
SET PASSMARKS=30
WHERE SubjectCode = 'EC501';

SELECT * FROM Subject;


ALTER TABLE Results DROP COLUMN PassMarks;
SELECT * FROM Results;
