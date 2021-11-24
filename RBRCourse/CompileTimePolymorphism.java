public class CompileTimePolymorphism {
    protected void show(int x) {
        System.out.println("int show x =" + x);
    }

    protected void show(double s) {
        System.out.println("double show s =" + s);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.show(5);
        obj.show(5.999999);
    }
}
