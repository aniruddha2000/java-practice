package AdopterPattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("-----Turkey-----");
        turkey.gobble();
        turkey.fly();

        System.out.println("-----Duck-----");
        testDuck(duck);

        System.out.println("-----The turkey adapter says-----");
        testDuck(turkeyAdapter);
    }

    protected static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
