package Pattern_Printing.compositePattern;

import java.util.Scanner;

public class Rhombush_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= n + 1 - i; j++) {// Columns.............
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n; j++) { //Rhombus formula
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}