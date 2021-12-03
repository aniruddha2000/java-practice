public class StaticKeyword {
    static int count = 0;

    StaticKeyword() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println(StaticKeyword.count);

        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword obj3 = new StaticKeyword();
        StaticKeyword obj4 = new StaticKeyword();
        System.out.println(StaticKeyword.count);

    }
}
