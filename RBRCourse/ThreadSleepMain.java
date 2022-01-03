class SleepingThread extends Thread {
    SleepingThread(String tname) {
        super(tname);
    }

    public void run() {
        System.out.println(getName() + " is running");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(getName() + " i=" + i);
        }
        System.out.println(getName() + " finished");
    }
}

public class ThreadSleepMain {
    public static void main(String[] args) {
        SleepingThread st1 = new SleepingThread("First");
        SleepingThread st2 = new SleepingThread("Second");
        st1.start();
        st2.start();
    }
}
