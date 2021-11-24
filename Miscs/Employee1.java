class Employee1 {
    public String name;
    public double sal;
    public int id;
    public static int count;

    Employee1() {
        name = "Temp";
        sal = 15000;
        id = ++count;
    }

    Employee1(String n) {
        name = n;
        sal = 25000;
        id = ++count;
    }

    Employee1(String n, double s) {
        name = n;
        sal = s;
        id = ++count;
    }

    public void incsal() {
        sal = sal + 2000;
    }

    public void incsal(double i) {
        sal = sal + ((i / 100.0) * sal);
    }

    public void incsal(double i, double b) {
        sal = sal + ((i / 100.0) * sal) + b;
    }

    public void disp() {
        System.out.println("Name " + " Salary " + " Id " + " Count");
        System.out.println(name + "  " + sal + "  " + id + "  " + count);
    }

    public static Employee1 comp(Employee1 a, Employee1 b) {
        if (a.sal > b.sal) {
            return a;
        } else {
            return b;
        }
    }
}
