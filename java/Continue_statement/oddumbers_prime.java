package Continue_statement;

public class oddumbers_prime {
    public static void main(String[] args) {
//        for (int i =1; i<=100; i++){
//            if (i%2==0) System.out.print(i+ " ");
        //or
//        for (int i = 1 ; i<=100;i+=2){
//            System.out.print(i+ " ");
//        }
        for (int i = 1 ; i<=100;i++){
            if(1%2==0){ continue;

            }
            System.out.print(i+ " ");
        }
    }
}
