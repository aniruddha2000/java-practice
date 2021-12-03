interface InterfaceShape {
    double area();
}

class RectangleClass implements InterfaceShape {
    double s1, s2;

    RectangleClass(double a, double b) {
        s1 = a;
        s2 = b;
    }

    public double area() {
        return s1 * s2;
    }
}

class TriangleClass implements InterfaceShape {
    double s1, s2;

    TriangleClass(double a, double b) {
        s1 = a;
        s2 = b;
    }

    public double area() {
        return 0.5 * s1 * s2;
    }
}

public class InterfaceArea {
    public static void main(String[] args) {
        InterfaceShape obj = new RectangleClass(10.5, 5.6);
        System.out.println("Rectangle = " + obj.area());
        obj = new TriangleClass(10, 14);
        System.out.println("Triangle = " + obj.area());
    }
}
