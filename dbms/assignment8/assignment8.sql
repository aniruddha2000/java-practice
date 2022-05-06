-- i. Find the number of student in CSE second year.

select count(rollno) as NUM_OF_STUDENT
  from Student
 where deptcode = 'CSE';

-- ii. Find the number of students whose marks of any subject is available.

select count(rollno) as NUM_OF_STUDENT 
  from results;

-- iii. Find total number of faculty.

select count(*) as NUM_OF_FACULTY
  from faculty;

-- iv. Find the 5th semester student(s) who got maximum marks in a subject.

select Student.rollno, Results.sub_code, Results.marks
  from Student, Results
  where Student.rollno = Results.rollno and Student.semester = 'SEM5'
  and Results.marks IN (
      select max(marks)
        from results
       group by sub_code
  );

-- v. Find the roll number  of a student who got maximum marks in CS501.

select Student.rollno
  from Student, Results
 where Student.rollno, = Results.rollno and
 results.marks IN (
     select max(marks)
       from results
      where sub_code = 'CS501'
 );

-- vi. Display average marks of CS502.

select avg(marks) as AVG_MARKS
  from results
 where results.sub_code = 'CS502';

-- vii. Find the number of students in each department with their department code.

select count(rollno) as COUNT_STDNT_DEPT
  from Student
 group by Student.deptcode;

-- viii. Find the number of students in each department with their department name.

select Department.Deptname, count(rollno) as COUNT_STDNT_DEPT
  from Student, Department
 where Student.deptcode = Department.deptcode
 group by Department.deptname;

-- ix.  Find the Department with more than three faculty.

select deptcode, count(teacher) as TEACHER_COUNT
  from Subject
 group by deptcode having count(teacher) > 3;

-- x.  Find the student name and roll no who get more than 80 in at least two subject.

SELECT Name, RollNo FROM Student WHERE RollNo IN (
    SELECT RollNo FROM (SELECT * FROM Result WHERE Marks > 80) 
    GROUP BY RollNo HAVING COUNT(*) >= 2);

-- xi. Find the student name and roll no who get more than 70 in average.

SELECT Name, RollNo FROM Student WHERE RollNo IN  (
    SELECT RollNo FROM Result 
    GROUP BY RollNo HAVING AVG(Marks) > 70);

-- xii. Display number of subject semester wise in dept CSE.

SELECT Semester, COUNT(SubjectCode) AS NoOfSubject FROM 
Subject WHERE DeptCode='CSE' GROUP BY Semester;

-- xiii. Find the department name with maximum number of student.

SELECT DISTINCT DeptName FROM Department JOIN Student 
USING (DeptCode) WHERE DeptCode =(SELECT DeptCode FROM 
Student GROUP BY DeptCode HAVING COUNT(RollNo) =(SELECT MAX(COUNT(RollNo)) 
FROM Student GROUP BY DeptCode));

-- xiv. Find the second highest marks of the result table.

SELECT MAX(Marks) FROM Result WHERE Marks NOT IN(
    SELECT MAX(Marks) FROM Result);

-- xv. Find the students name who got highest marks, subjectwise. 

SELECT Name, Marks, Sub_Code FROM Student JOIN 
Result USING (RollNo) WHERE Marks IN (
    SELECT MAX(Marks) FROM Result GROUP BY Sub_Code);