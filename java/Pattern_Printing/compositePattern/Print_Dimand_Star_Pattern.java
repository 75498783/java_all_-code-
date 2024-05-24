package Pattern_Printing.compositePattern;

import java.util.Scanner;

public class Print_Dimand_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n; i++) { //Row
            for (int j = 1; j <= nsp; j++){//
                System.out.print(" " +" ");//

            }
            for (int j=1;j<=nst;j++){//spaces
                System.out.print("*"+" ");

            }
            nsp--;
            nst +=2;
            System.out.println();

        }

        nsp = 1;
        nst = nsp-4;
        for (int i = 1; i <=n-1; i++) { //Row
            for (int j = 1; j <= nsp; j++){//
                System.out.print(" " +" ");//

            }
            for (int j=1;j<=nst;j++){//spaces
                System.out.print("*"+" ");

            }
            nsp++;
            nst -=2;
            System.out.println();

        }
    }
}

