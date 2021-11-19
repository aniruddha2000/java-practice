package RBRCourse;

public class WrapperClass {
    public static void main(String[] args) {

        // Primitive -> Wrapper Class
        int salary = 120000;
        Integer salaryWrapperInteger = Integer.valueOf(salary);
        System.out.println(salary);
        System.out.println(salaryWrapperInteger);
        // Autoboxing
        Integer salaryAutoboxing = salary;
        System.out.println("Autoboxing = " + salaryAutoboxing);

        // Wrapper Class -> Primitive
        int salaryPrimitive = salaryWrapperInteger.intValue();
        System.out.println(salaryPrimitive);
        //Unboxing
        int salaryUnboxing = salaryAutoboxing;
        System.out.println("Unboxing = " + salaryUnboxing);
    }
}
