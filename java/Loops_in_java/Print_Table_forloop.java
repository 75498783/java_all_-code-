package Loops_in_java;

import java.util.Scanner;

public class Print_Table_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 15;i<=150;i++){
            if(i%15==0) System.out.println(i);
        }
    }
}
