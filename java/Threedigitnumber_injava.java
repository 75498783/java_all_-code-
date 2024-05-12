import java.util.Scanner;

public class Threedigitnumber_injava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n = sc.nextInt();
        if (n>99 && n<1000) System.out.println(" This is a three Digit number  ");
        else System.out.println("Not a three Digit number");

    }
}
