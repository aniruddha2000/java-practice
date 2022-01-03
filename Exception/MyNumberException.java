class CustomException extends Exception {
    private int num;

    CustomException(int a) {
        num = a;
    }

    public String toString() {
        return "CustomException Thrown with num = " + num;
    }
}

public class MyNumberException {
    static void check(int x) throws CustomException {
        System.out.println("Check called x = " + x);
        if (x < 0) {
            throw new CustomException(x);
        }
        System.out.println("Returning from function");
    }

    public static void main(String[] args) {
        try {
            check(10);
            check(-10);
        } catch (CustomException e) {
            System.out.println("Exception Caught:");
            System.out.println(e);
        }
    }
}
