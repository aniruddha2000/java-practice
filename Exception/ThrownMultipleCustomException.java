class MyException1 extends Exception {

}

class MyException2 extends Exception {

}

class MyException3 extends Exception {

}

public class ThrownMultipleCustomException {
    public static void main(String[] args) {
        Exception arr[] = { new MyException1(), new MyException2(), new MyException3() };
        for (int i = 0; i <= 2; i++) {
            try {
                throw arr[i];
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
        }
    }
}
