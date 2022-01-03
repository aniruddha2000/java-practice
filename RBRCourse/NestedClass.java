public class NestedClass {
    private String strOuter = "Outer";
    static String strOuterStatic = "Static Outer";

    class InnerClass {
        void demo() {
            System.out.println("String is " + strOuter);
        }
    }

    static class StaticInnerClass {
        void staticDemo() {
            System.out.println("String is " + strOuterStatic);
        }
    }

    public static void main(String[] args) {
        new NestedClass().new InnerClass().demo();
        NestedClass.StaticInnerClass sObj;
        sObj = new NestedClass.StaticInnerClass();
        sObj.staticDemo();
    }
}
