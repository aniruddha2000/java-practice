-- Create view V_MARKS with roll no, student name, subject code, marks of all CSE students.

create view V_MARKS as select Student.rollno, Student.name,
    Results.sub_code, Results.marks 
    from Student, Results
    where Student.rollno = Results.rollno;

select * from V_MARKS;
drop view V_MARKS;

-- Create view V_CLASSTAKEN with subject code, subject name, Faculty code, faculty name where the subject is taught by that faculty.

create view V_CLASSTAKEN as select Subject.subjectcode, Subject.subjectname,
Faculty.fid, Faculty.name from Subject, Faculty
where Faculty.fid = Subject.teacher;

select * from V_CLASSTAKEN;
drop view V_CLASSTAKEN;

-- Create view V_SUBJECT with subject_code, subject_name, teacher name where number of student in the subject is more than 1.

create view V_SUBJECT as select Subject.subjectcode, Subject.subjectname, Faculty.name
from Subject, Faculty where subject.teacher = faculty.fid and subject.subjectcode in (
    select sub_code from Results
    group by sub_code
    having count(rollno) > 1
);

select * from V_SUBJECT;
drop view V_SUBJECT;

-- Create view V_STUDENT with student name, roll number, department who appeared  in at least one examination.

create view V_STUDENT as select student.name, student.rollno, student.deptcode
from student, results where student.rollno = results.rollno;

select * from V_STUDENT;
drop view V_STUDENT;

-- Create view V_DEPT with dept code, semester, number of student with more than 75 marks in at least one subject.

create view V_DEPT as
    select deptcode, semester, count(marks) as number_of_student
    from subject join results on subject.subjectcode = results.sub_code
    where results.marks > 75 group by deptcode, semester;

select * from V_DEPT;
drop view V_DEPT;