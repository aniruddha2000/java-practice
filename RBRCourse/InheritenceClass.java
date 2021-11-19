package RBRCourse;

class ParentClass {
    public void salaryOfCompany(String companyName) {
        switch (companyName) {
        case "Google":
            System.out.println("120K");
            break;

        case "Amazon":
            System.out.println("110K");
            break;

        default:
            System.out.println("Average 80k in SF");
            break;
        }
    }
}

class ChildClass extends ParentClass {
    public void display() {
        System.out.println("Hey I am from the child class!");
    }
}

public class InheritenceClass {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.salaryOfCompany("Google");
        child.salaryOfCompany("Amazon");
        child.salaryOfCompany("");

        ParentClass obj2 = new ChildClass();
        obj2.salaryOfCompany("");
    }
}
