import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class input {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("You entered " + num);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("You entered " + str);

        // input.close(); Note: we cannot close the stream

        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(istream);

        // Note: The above is the same as:
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strt;
        System.out.println("Say something i am giving up on you.");
        strt = reader.readLine();
        System.out.println("You said: " + strt);

        reader.close();
        istream.close();

        BufferedWriter ostream = new BufferedWriter(new OutputStreamWriter(System.out));
        ostream.write("Hello, world! from the Buffered Writer to the stdout");
        ostream.flush();
        input.close();
    }

}
