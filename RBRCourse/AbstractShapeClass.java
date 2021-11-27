abstract class Shape {
    double s1, s2;

    Shape(double a, double b) {
        s1 = a;
        s2 = b;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return s1 * s2;
    }
}

class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * s1 * s2;
    }
}

public class AbstractShapeClass {
    public static void main(String[] args) {
        Shape ref = new Rectangle(10.5, 5.6);
        System.out.println("Area of rectangle = " + ref.area());
        ref = new Triangle(10, 14);
        System.out.println("Area of triangle = " + ref.area());
    }
}
