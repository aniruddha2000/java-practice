
class DoubleNumberCall {
    public int x;

    DoubleNumberCall doubleIt() {
        DoubleNumberCall tmp = new DoubleNumberCall();
        tmp.x = 2*x;
        return tmp;
    }
}

public class DoubleNumber {
    public static void main(String[] args) {
        DoubleNumberCall i = new DoubleNumberCall();
        i.x = 10;
        DoubleNumberCall d = i.doubleIt();
        System.out.println(d.x);
    }
}
