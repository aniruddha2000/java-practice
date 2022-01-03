public class BlankFinalVariable {
    final String COMPANY;
    String salary;

    BlankFinalVariable(final String salary, String company) {
        this.salary = salary;
        COMPANY = company;
    }

    private void printSalary() {
        System.out.println(COMPANY + "-" + salary);
    }

    public static void main(String[] args) {
        BlankFinalVariable obj = new BlankFinalVariable("150k", "Google");
        obj.printSalary();
    }
}
