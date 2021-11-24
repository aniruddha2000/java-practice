import java.util.*;

public class Employee1test {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Details:");

        System.out.println("Enter the name of Employee2:");
        String n1 = in.nextLine();
        System.out.println("Enter the name of Employee3:");
        String n2 = in.nextLine();
        System.out.println("Enter the salary of Employee3:");
        double s2 = in.nextDouble();
        System.out.println("-------------------------------------------------------------------");
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1(n1);
        Employee1 e3 = new Employee1(n2, s2);
        System.out.println("Employee Details are :");
        e1.disp();
        e2.disp();
        e3.disp();

        e1.incsal();
        e2.incsal(20.0);
        e3.incsal(25.0, 5000.0);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Employee Details after increment:");
        e1.disp();
        e2.disp();
        e3.disp();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Employee having better salary along with details are:");
        Employee1 e4 = Employee1.comp(e2, e3);
        e4.disp();
        in.close();
    }
}
