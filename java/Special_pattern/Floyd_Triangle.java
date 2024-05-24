package Special_pattern;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= i; j++) {// Columns.............
                System.out.print(a++ + " ");
//                a++;
            }
            System.out.println();

        }
    }
}