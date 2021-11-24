class Course {
    public void course() {
        System.out.println("This is a course!");
    }

    public void study() {
        System.out.println("I am studying!");
    }
}

class JavaCourse extends Course {
    public void course() {
        System.out.println("This is a java course!");
    }
}

class GolangCourse extends Course {
    public void course() {
        System.out.println("This is a golang course");
    }
}

public class CourseMethodOverriding {
    public static void main(String[] args) {
        Course courses[] = new Course[3];
        courses[0] = new Course();
        courses[1] = new GolangCourse();
        courses[2] = new JavaCourse();

        for (Course course : courses) {
            course.course();
            course.study();
        }
    }
}
