public class JoinMethodExample extends Thread {
    JoinMethodExample(String str) {
        super(str);
        start();
    }

    public void run() {
        try {
            System.out.println("Hello from thread " + getName());
            Thread.sleep(1000);
            System.out.println("Bye from thread " + getName());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            new JoinMethodExample("First").join();
        } catch (Exception e) {
            System.out.println(e);
        }
        new JoinMethodExample("Second");
        new JoinMethodExample("Third");
    }
}
