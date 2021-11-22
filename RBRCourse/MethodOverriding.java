package RBRCourse;

class BaseClassMethod {
    BaseClassMethod() {
        System.out.println("Hey I am the constructor of the Base class");
    }

    public void printCollege() {
        System.out.println("GNIT");
    }
}

public class MethodOverriding extends BaseClassMethod {
    MethodOverriding() {
        // super(); // Even of you dont call the super It will call the constructor of
        // the BaseClass
        System.out.println("Hey I am the constructor of the MethodOverriding Class");
    }

    public void printCollege() {
        super.printCollege();
        System.out.println("IIT Haldirams");
    }

    public static void main(String[] args) {
        MethodOverriding college = new MethodOverriding();
        college.printCollege();
    }
}
