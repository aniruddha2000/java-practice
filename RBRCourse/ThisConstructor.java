public class ThisConstructor {
    Integer age;

    ThisConstructor(Integer age) {
        this.age = age;
    }

    ThisConstructor(ThisConstructor constructor) {
        age = constructor.age;
    }

    private void printAge() {
        System.out.println("My age is " + this.age);
    }

    public static void main(String[] args) {
        ThisConstructor obj1 = new ThisConstructor(21);
        obj1.printAge();
        ThisConstructor obj2 = new ThisConstructor(obj1);
        obj2.printAge();
    }
}
