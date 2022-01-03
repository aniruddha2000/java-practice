class InnerStaticBlockWithConstructor {
    InnerStaticBlockWithConstructor() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Hey it's a static block");
    }
}

public class StaticBlockWithConstructor {
    public static void main(String[] args) {
        new InnerStaticBlockWithConstructor();
        new InnerStaticBlockWithConstructor();
    }
}
