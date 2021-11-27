abstract class FunctionRow {
    abstract void f1();
}

class DerivedClassA extends FunctionRow {
    void f1() {
        System.out.println("Provide function toggle");
    }
}

// Derived class must have a implementation of the f1 method
// Otherwide it also becomes a abstract class and we can't
// create any object of the abstract class
// // class DerivedClassB extends FunctionRow {
// // }

public class AbstractClassWithMethod {

    public static void main(String[] args) {
        FunctionRow obj = new DerivedClassA();
        obj.f1();
        // obj = new DerivedClassB();
        // obj.f1();
    }
}
