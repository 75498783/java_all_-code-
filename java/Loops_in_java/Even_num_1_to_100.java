package Loops_in_java;

import java.util.Scanner;

public class Even_num_1_to_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int n= sc.nextInt();
        //Print Even Number..............
        for (int i = 1; i<=100;i++){
//            if (i%2==0) System.out.println(i);
            //Print only odd number....................
            if (i%2==0) System.out.println(i);
        }
    }
}
