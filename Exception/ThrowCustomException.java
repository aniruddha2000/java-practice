public class ThrowCustomException {
    static void rethrow() {
        try {
            throw new NumberFormatException("Exceptionthrown");
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: ");
            System.out.println("Rethrowing");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            rethrow();
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
