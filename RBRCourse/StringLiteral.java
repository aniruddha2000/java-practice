package RBRCourse;

public class StringLiteral {
    public static void main(String[] args) {

        String company = "Netflix";
        String company2 = "Netflix";
        if (company == company2) {
            System.out.println("Same company");
        }
        String company3 = new String("Netflix");
        if (company == company3) {
            System.out.println("Same company");
        } else {
            System.out.println("Different company");
        }

        if (company.equals(company3)) {
            System.out.println("Same company according to equals");
        }

        String language = "Java";
        System.out.println(language.concat("Script"));
    }
}
