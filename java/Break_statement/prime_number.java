package Break_statement;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int x = 0;//0 means prime]
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("composite number");
                x = 1;
                break;
            }
            if (x==0) System.out.println("Prime Number");
            break;
        }
         if (n == 1) {
            System.out.println("neither composite nor Prime");

        }


    }
}