package Loops_in_java;

import java.util.Scanner;

public class Print_5_or_3_divisible_number_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 1; i<=100; i++){
            //3 se divisible number..................
//            if (i%3==0) System.out.println(i);



            //5 se divisible number.............
            if (i%5==0) System.out.println(i);

        }
    }
}
