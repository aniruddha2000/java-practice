
class BaseClassMethodParameterized {
    int age;

    BaseClassMethodParameterized(int age) {
        this.age = age;
        System.out.println("My age is " + age);
        System.out.println("Hey I am the constructor of the Base class");
    }

    public void printCollege() {
        System.out.println("GNIT");
    }
}

public class SuperClassWithParameter extends BaseClassMethodParameterized {
    SuperClassWithParameter(int a) {
        super(a);
        System.out.println("Hey I am the constructor of the MethodOverriding Class");
    }

    public void printCollege() {
        super.printCollege();
        System.out.println("IIT Haldirams");
    }

    public static void main(String[] args) {
        SuperClassWithParameter college = new SuperClassWithParameter(21);
        college.printCollege();
    }
}
