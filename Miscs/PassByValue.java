import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue {
    // private static void processData(int data) {
    // data = data + 10;
    // }

    // private static void modifyArray(List<String> companyRef) {
    //     companyRef.add("Netflix");
    // }

    private static void modifyArray(List<String> companyRef) {
    companyRef = new ArrayList<>(companyRef);
    companyRef.add("Netflix");
    }

    public static void main(String[] args) {
        // int data = 10;
        // System.out.println("Data before calling method = " + data);
        // processData(data);
        // System.out.println("Data after calling method = " + data);

        List<String> company = new ArrayList<>(Arrays.asList("Google", "Amazon",
                "Microsoft"));
        System.out.println("Data before calling = " +
                Arrays.toString(company.toArray()));
        modifyArray(company);
        System.out.println("Data before calling = " +
                Arrays.toString(company.toArray()));
    }
}
