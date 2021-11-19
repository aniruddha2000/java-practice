package SingletonPattern;

public class SingletonClass {
    private volatile static SingletonClass uniqueInstance;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonClass.class) {
                uniqueInstance = new SingletonClass();
                System.out.println("One instance created");
            }
        } else {
            System.out.println("More than one instance is not allowed!");
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        // SingletonClass class1 = new SingletonClass();
                // class1.getInstance();
        // SingletonClass class2 = new SingletonClass();
        // class2.getInstance();
    }
}
