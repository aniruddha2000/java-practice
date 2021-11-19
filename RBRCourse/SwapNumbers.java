package RBRCourse;

class Double {
    int x;
}

public class SwapNumbers {
    public static void swap(Double a, Double b) {
        Double tmp = new Double();
        tmp.x = a.x;
        a.x = b.x;
        b.x = tmp.x;
    }
    public static void main(String[] args) {
        Double i = new Double();
        i.x = 10;
        Double j = new Double();
        j.x = 20;
        swap(i, j);
        System.out.println("i= " + i.x + ", j = " + j.x);
    }
}
