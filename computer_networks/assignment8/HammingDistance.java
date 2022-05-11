import java.io.*;
import java.lang.Math;

public class HammingDistance {

    public static String myJoin(int[] arr, String separator) {
        if (null == arr || 0 == arr.length)
            return "";

        StringBuilder sb = new StringBuilder(256);
        sb.append(arr[0]);

        for (int i = 1; i < arr.length; i++)
            sb.append(separator).append(arr[i]);

        return sb.toString();
    }

    public static void main(String args[]) throws IOException {
        int i = 0, r = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Length of Dataword");
        int n = Integer.parseInt(br.readLine());

        int dataword[] = new int[n];
        System.out.println("Enter Databits one by one starting from MSB");
        for (i = 0; i < n; i++) {
            dataword[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("DataWord: " + myJoin(dataword, " "));

        // calculate the number of redundant bits
        while (Math.pow(2, r) < (n + r + 1)) {
            r++;
        }
        System.out.println("Number of redundant bits to be added: " + r);

        // calculate codeword length
        int coded[] = new int[n + r];
        System.out.println("CodeWord Length:" + coded.length);

        // Find the code word denoting parity positions
        for (i = 0; i < r; i++) {
            coded[(int) Math.pow(2, i) - 1] = -1;
        }

        int j = 0;
        for (i = 0; i < (n + r); i++) {
            if (coded[i] != -1) {
                coded[i] = dataword[j];
            }
        }
        System.out.println("Code Word denoting parity positions: " + myJoin(coded, " "));

        // Find the codeword with the redundant bits
        for (i = 0; i < (n + r); i++) {
            if (coded[i] != -1) {
                continue;
            }

            int x = (int) (Math.log(i + 1) / Math.log(2));
            int count = 0;
            for (j = i + 2; j <= (r + n); j++) {
                int res = j & (1 << x);
                if (res == 1) {
                    if (coded[j - 1] == 1) {
                        count++;
                    }
                }
            }
            if (count % 2 == 0) {
                coded[i] = 0;
            } else {
                coded[i] = 1;
            }
        }

        // Reversing the generated code word because ... that's what the correct
        // codeword is
        int temp[] = new int[n + r];
        int k = 0;
        for (i = n + r - 1; i >= 0; i--) {
            temp[k] = coded[i];
            k = k + 1;
        }
        coded = temp;
        System.out.println("Code Word denoting parity positions: " + myJoin(coded, " "));

        // recieved codeword
        int recieved_coded[] = new int[n + r];
        int res = 0;
        System.out.println("Enter recieved codeword one by one starting from MSB");
        for (i = 0; i < n + r; i++) {
            recieved_coded[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Recieved Code word: " + myJoin(recieved_coded, " "));

        // detect error
        for (i = 0; i < n + r; i++) {
            int val = 0;
            for (j = 1; j < n + 1; j++) {
                if ((j & (int) Math.pow(2, i)) == (int) Math.pow(2, i)) {
                    int x = Math.floorMod(
                            (-1 * j), recieved_coded.length);
                    val = val ^ recieved_coded[x];
                }
            }
            res = res + val * (int) (Math.pow(10, i));
        }

        System.out.println("Resultant error in binary: " + res);
    }
}
