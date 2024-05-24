package Special_pattern;

import java.util.Scanner;

public class Binary_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {// Row...............
            for (int j = 1; j <= i; j++) {// Columns.............
//                if (i % 2 == 1) {
//                    if (j % 2 == 1) System.out.print(1 + " ");.....//i and j sum = odd number....
//                    else System.out.print(0 + " ");
//                } else {//i%2==0
//                    if (j % 2 == 0) System.out.print(1 + " ");//  and j+i sum = Even number...
//                    else System.out.print(0 + " ");
//                }


                // Another Solution(it is very shortest solution.........
                if ((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");

            }
            System.out.println();
        }

    }
}
