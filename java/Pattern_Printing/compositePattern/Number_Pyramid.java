package Pattern_Printing.compositePattern;

import java.util.Scanner;

public class Number_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= n  - i; j++) {// Columns.............
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { //Rhombus formula
                System.out.print(j+ " ");
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
