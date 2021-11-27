abstract class AbstractBaseClass {
    abstract void method1();

    AbstractBaseClass() {
    }

    static void method2() {
        System.out.println("Method2 printed");
    }
}

public class AbstractBaseClassTest extends AbstractBaseClass {
    void method1() {
        AbstractBaseClass.method2();
    }

    public static void main(String[] args) {
        AbstractBaseClass obj = new AbstractBaseClassTest();
        obj.method1();
    }
}
