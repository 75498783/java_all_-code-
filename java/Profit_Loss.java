import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price:");
        int sp = sc.nextInt();
        if (sp>cp){
            System.out.print("Profit is:");
            System.out.println(sp-cp);
        }
        if (cp>sp){
            System.out.print("Losses is:"+(cp-sp));
        }
        if (cp==sp){
            System.out.println(" No profit No loss");
        }
    }
}
