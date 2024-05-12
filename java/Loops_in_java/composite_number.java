package Loops_in_java;

import java.util.Scanner;

public class composite_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("composite number");

                break;
            }
            }

        }


    }

