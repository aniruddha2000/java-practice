-- Create Subject Table
CREATE TABLE Subject(
    SubjectCode VARCHAR2(6) PRIMARY KEY,
    SubjectName VARCHAR2(50) NOT NULL,
    DeptCode VARCHAR2(4),
    Semester VARCHAR2(5) NOT NULL,
    FOREIGN KEY(DeptCode) REFERENCES Department(DeptCode)
);

-- Create Resuls Table
CREATE TABLE Results(
    RollNo NUMBER(6) NOT NULL,
    Sub_Code VARCHAR2(8) NOT NULL,
    Marks NUMBER(3) CHECK(Marks>=0 AND Marks<=100),
    PassMarks NUMBER(2)
);

-- DESCRIBE TABLE
DESC Subject;
DESC Results;

-- Make a composite primary key for Results Table
-- RollNo and Sub_Code
ALTER TABLE Results ADD CONSTRAINT PK_Results PRIMARY KEY(RollNo, Sub_Code);

-- Foreign Key Constraint for Results Table
ALTER TABLE Results ADD CONSTRAINT FK_Results FOREIGN KEY(RollNo) REFERENCES Student(RollNo);

-- Insert Values into Subject Table
INSERT INTO Subject VALUES('CS301','Data Structures', 'CSE', 'SEM3');
INSERT INTO Subject VALUES('CS302','Computer Organization', 'CSE', 'SEM3');
INSERT INTO Subject VALUES('CS501','Discreate Mathematics', 'CSE', 'SEM5');
INSERT INTO Subject VALUES('CS502','Data Communication', 'CSE', 'SEM5');
INSERT INTO Subject VALUES('ECS501','Data Base Systems', 'ECE', 'SEM5');
INSERT INTO Subject VALUES('EC501','Analog Signals', 'ECE', 'SEM5');
INSERT INTO Subject VALUES('EC502','Operating Systems', 'ECE', 'SEM5');

-- Insert Values into Results Table
INSERT INTO Results VALUES(1001, 'CS501', 68, 40);
INSERT INTO Results VALUES(1002, 'CS501', 76, 40);
INSERT INTO Results VALUES(1003, 'CS501', 91, 40);
INSERT INTO Results VALUES(1001, 'CS502', 38, 40);
INSERT INTO Results VALUES(1002, 'CS502', 81, 40);
INSERT INTO Results VALUES(1003, 'CS502', 82, 40);
INSERT INTO Results VALUES(1023, 'CS301', 92, 40);
INSERT INTO Results VALUES(1029, 'CS301', 83, 40);
INSERT INTO Results VALUES(1500, 'CS301', 65, 40);
INSERT INTO Results VALUES(1023, 'CS302', 75, 40);
INSERT INTO Results VALUES(1029, 'CS302', 71, 40);
INSERT INTO Results VALUES(1500, 'CS302', 35, 40);
INSERT INTO Results VALUES(2001, 'ECS501', 67, 30);
INSERT INTO Results VALUES(2002, 'ECS501', 72, 30);
INSERT INTO Results VALUES(2101, 'EC501', 77, 40);

-- Print the Subject Table
SELECT * FROM Subject;

-- Print the Results Table
SELECT * FROM Results;
