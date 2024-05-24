package Pattern_Printing.compositePattern;

import java.util.Scanner;

public class Print_Number_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i<=2*n-1; i++) {// Row...............
            System.out.print(i+ " ");
        }
        System.out.println();
        n--;
        int nsp = 1;
        for (int i = 1; i <= n; i++) { //Row
            int a =1;
            for (int j = 1; j <= n+1-i; j++){//stars
                System.out.print("*"+" ");//
            }
            for (int j=1;j<=2*i-1;j++){//spaces
                System.out.print(" "+" ");
            }
            for (int j= 1;j<=n+1-i;j++){
                System.out.print("*"+" ");//star

            }
            System.out.println();

        }
    }
}
