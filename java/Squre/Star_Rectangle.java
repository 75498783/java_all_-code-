package Squre;

import java.util.Scanner;

public class Star_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the   row and column: " );
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i<=m;i++){// Row...............
            for (int j =1;j<=n;j++){// Columns.............
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
