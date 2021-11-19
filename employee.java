class Employee{
    private int emp_id;
    private String name, designation;
    private double salary;
    private static int count = 0;

    //constructor for Fresher
    public Employee(String name){
        count += 1;
        this.emp_id = count;
        this.name = name;
        this.designation = "Fresher";
        this.salary = 30000;
      }

    //constructor for Executive
    public Employee(String name, double salary, String designation ){
        count += 1;
        this.emp_id = count;
        this.name = name ;
        this.designation = designation;
        this.salary = salary;
    }

    //constructor for Temporary
    public Employee(){
        count +=1;
        this.emp_id = count;
        this.name = "Temporary Employee";
        this.designation = "Temporary";
        this.salary = 20000;
    }

    //display method
    void display(){
      System.out.println("------------------------------------");
      System.out.println("Employee ID is = " + this.emp_id);
      System.out.println("Name of the Employee is = " + this.name);
      System.out.println("Designation of the Employee is = " + this.designation);
      System.out.println("Salary of the Employee is = " + this.salary);

    }

    public static void main(String[] args) {
        Employee emp[] = new Employee[3];
        emp[0] = new Employee("This Is A New Employee");
        emp[1] = new Employee("Aniruddha", 50000, "Manager");
        emp[2] = new Employee();

        emp[0].display();
        emp[1].display();
        emp[2].display();
    }
}
