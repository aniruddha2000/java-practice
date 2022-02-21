public class MultiThreadWithRunnable implements Runnable {
    private int threadNumber;

    MultiThreadWithRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " from thread no - " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThreadWithRunnable obj = new MultiThreadWithRunnable(i);
            Thread myThread = new Thread(obj);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
