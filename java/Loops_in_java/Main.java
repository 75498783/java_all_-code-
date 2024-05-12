package Loops_in_java;

public class Main {
    public static void main(String[] args) {
        int i;
        System.out.println("Alphabets from (A-Z) are:");
        // ASCII value of A=65 and Z=90
        for (i = 65; i <= 90; i++) {

            System.out.print((char)i + " ");
        }
        System.out.println("\nAlphabets from (a-z) are:");

        for (i = 97; i <= 122; i++) {

            System.out.print((char)i + " ");
 }
}
}