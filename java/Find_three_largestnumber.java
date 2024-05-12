import java.util.Scanner;

public class Find_three_largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a = sc.nextInt();
        System.out.println("Enter Second num:");
        int b = sc.nextInt();
        System.out.println("Enter Third num:");
        int c = sc.nextInt();
        //Appraoch 1-logic
        if (a>b && a>c) System.out.println(a+ " is largest number");
        else if (b>a && b>c) System.out.println(b+ "is largest number");
        else {
            System.out.println(c+ " is largest number");
        }
    }
}
