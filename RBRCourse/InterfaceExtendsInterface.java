interface InterfaceA {
    default void trick() {
        System.out.println("It's trick A1 method");
    }
}

interface InterfaceB extends InterfaceA {
    default void trick() {
        InterfaceA.super.trick();
        System.out.println("It's trick A2 method");
    }
}

class ClassImplementsInterfaceAB implements InterfaceB {

}

public class InterfaceExtendsInterface {
    public static void main(String[] args) {
        ClassImplementsInterfaceAB obj = new ClassImplementsInterfaceAB();
        obj.trick();
    }
}
