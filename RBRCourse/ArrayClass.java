package RBRCourse;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        // int myArray[] = new int[] { 1, 2, 3, 4, 5 };
        // int[] myArray1 = {1,2,3,4,5};
        // System.out.println(myArray[1]);
        // System.out.println(myArray1[1]);

        // int[] intArray;
        // intArray = new int[10];
        // intArray[1] = 1;
        // intArray[2] = 2;
        // intArray[3] = 3;
        // for (int i : intArray) {
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numArray[] = new int[size];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        sc.close();
    }
}
