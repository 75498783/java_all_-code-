package conditional_statement;

import java.util.Scanner;

public class print_odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n%2==0) System.out.println("Even number");
        if (n%2==1) System.out.println("OOd number");
    }
}
