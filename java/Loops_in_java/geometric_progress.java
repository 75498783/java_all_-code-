package Loops_in_java;

import java.util.Scanner;

public class geometric_progress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe:");
        int n = sc.nextInt();
        //print squre value...........
        int a = 1;
        for (int i = 1; i<= n;i++) {
            System.out.println(a);

            a*=2;

        }
    }
}
