public class NumberFormat {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("Aniruddha");
            System.out.println(x);
        } catch (NumberFormatException eObj) {
            System.out.println(eObj.getMessage());
        }
        System.out.println("Outside try-catch block");
    }
}
