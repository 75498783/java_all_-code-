package Special_pattern;

import java.util.Scanner;

public class Starplus_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        int mid = n/2+1;
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= n ; j++) {// Columns.............
      if(i==mid|| j==mid)
          System.out.print("*" + " ");
      else System.out.print(" " + " ");

            }
            System.out.println();
        }
    }
}