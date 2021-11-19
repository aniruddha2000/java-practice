package RBRCourse;

public class Constructors {
    public Constructors() {
        System.out.println("Hey there I am the constructor!");
    }

    Constructors(String arg) {
        System.out.println("Hey there it is the second " + arg);
    }

    public static void main(String[] args) {
        // Constructors obj1 = new Constructors();
        // Constructors obj2 = new Constructors("Constructor!");
        // obj1.Constructors();
    }
}
