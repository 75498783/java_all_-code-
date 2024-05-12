import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = sc.nextInt();
        System.out.println("Enter Second side:");
        int b = sc.nextInt();
        System.out.println("Enter Third side:");
        int c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b) System.out.println("Valid Triangle");
        else System.out.println("Not Valid Triangle" );
    }
}
