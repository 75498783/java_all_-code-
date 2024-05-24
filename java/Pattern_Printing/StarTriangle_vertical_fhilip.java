package Pattern_Printing;

import java.util.Scanner;

public class StarTriangle_vertical_fhilip {//  Right Triangle....print
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the n: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {// Row...............
//             for (int j = 1; j <= n; j++) {// Columns.............
//             if (i+j>n)  System.out.print("*"+" ");
//             else System.out.print(" "+" ");//spaces
//            }
//            System.out.println();
        //Another method............
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= n-i; j++) {// Columns.............
                System.out.print(" " + " ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();



            }
    }
}