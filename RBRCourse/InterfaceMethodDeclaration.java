interface InnerInterfaceMethodDeclaration {
    default void google() {
        System.out.println("Google");
    }

    static void twitter() {
        System.out.println("Twitter");
    }

    // private void oracle() {
    // System.out.println("Oracle");
    // }
}

class InnerInterfaceMethodDeclaration_1 implements InnerInterfaceMethodDeclaration {

}

public class InterfaceMethodDeclaration implements InnerInterfaceMethodDeclaration {
    public static void main(String[] args) {
        InnerInterfaceMethodDeclaration obj = new InnerInterfaceMethodDeclaration_1();
        obj.google();
        InnerInterfaceMethodDeclaration.twitter();
    }
}
