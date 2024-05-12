package Loops_in_java;

import java.util.Scanner;

public class print_num_1to_n{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int n= sc.nextInt();
        for(int i = 1; i<=100; i++){
           if (n%i==0)    System.out.println(i);
        }
    }
}
