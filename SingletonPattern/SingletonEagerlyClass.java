package SingletonPattern;

public class SingletonEagerlyClass {
    private static SingletonEagerlyClass uniqueInstance = new SingletonEagerlyClass();

    private SingletonEagerlyClass() {
    }

    public static SingletonEagerlyClass getInstance() {
        return uniqueInstance;
    }
}
