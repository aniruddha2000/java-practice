class Printer<T> {
    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }

    public void print() {
        System.out.println(value);
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<Integer>();
        obj.value = 10;
        obj.show();
    }
}
