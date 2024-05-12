package While_loop;

import java.util.Scanner;

public class countThe_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter The Number :");
        int n = sc.nextInt();
    int count  =0;
    while (n!=0){
        n/=10;
        count++;
    }
        System.out.println(count);





    }
}
