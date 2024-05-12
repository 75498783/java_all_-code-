package conditional_statement;

import java.util.Scanner;

public class Student_gread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int n = sc.nextInt();
        if (n>=81) System.out.println("A+ Gread");
        if (n>=61 && n<=80) System.out.println(" A Gread");
        if( n>=41 && n<=60) System.out.println("B Gread");
        if (n<=40) System.out.println(" Faile");
    }
}
