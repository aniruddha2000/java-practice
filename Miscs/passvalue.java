public class passvalue {
    /*
     * Pass by value is being exhibited by the following function wherein the
     * changes made in the formal parameters are not reflected in the actual
     * parameters.
     */ public void change(int a, int b) {
        a = a * 2;
        b = b + 2;
        System.out.println("Changed Values of the formal parameters:");
        System.out.println("a= " + a + " b= " + b);
    }

    public static void main(String[] args) {
        passvalue ob = new passvalue();
        int a = 15, b = 30;
        System.out.println("Original Values of the actual parameters:");
        System.out.println("a= " + a + " b= " + b);
        ob.change(a, b);
        System.out.println("Values of the actual parameters after function has been invoked:");
        System.out.println("a= " + a + " b= " + b);
    }
}
