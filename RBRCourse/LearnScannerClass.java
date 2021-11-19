package RBRCourse;

import java.util.Scanner;


public class LearnScannerClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write int : ");
        int a = scn.nextInt();
        scn.nextLine();
        System.out.println(a);
        System.out.println("Write line : ");
        String b = scn.nextLine();
        System.out.println(b);
        scn.close();
    }
}
