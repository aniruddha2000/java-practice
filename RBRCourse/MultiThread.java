public class MultiThread extends Thread {
    private int threadNumber;
    MultiThread(int threadNumber) {
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
            MultiThread obj = new MultiThread(i);
            obj.start();
        }
    }
}
