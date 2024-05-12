import java.util.Scanner;

public class Arithmatic_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe:");
        int n = sc.nextInt();
//         1,3,5,7,9
//        for (int i= 1;i<=2*n-1;i+=4){
//            System.out.println(i);
//        int a= 4;
//            //
//        for (int i= 1; i<=n; i++){
//            System.out.println(a);
//            a += 3;
//        }
        int a= 4 ,b = -3;
//            //
        for (int i= 1; i<=n; i++) {
            System.out.println(a);
            a += b;
        }
    }
}
