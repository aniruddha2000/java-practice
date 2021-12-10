public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3, 4 };
            int x = 2 / arr[5];
            System.out.println(x);
            System.out.println("This never going to execute");
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Excention caught " + E);
        }
    }
}
