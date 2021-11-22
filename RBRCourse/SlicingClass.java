package RBRCourse;

class BaseClass {
    int a = 10;
    int b = 15;
}

public class SlicingClass extends BaseClass {
    int c = 20;
    public static void main(String[] args) {
        SlicingClass slice = new SlicingClass();
        BaseClass base = new BaseClass();
        base = slice;
        System.out.println(base.a + base.b);
    }
}
