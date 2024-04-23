import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        guess();
        System.out.println("Guess a number between 1 and 1000.");
        num = input.nextInt();

        if (num >= 1 && num <= 1000)
        {
            while (checkNumber(num) != true)
            {
                System.out.println("Guess again");
                num = input.nextInt();
                checkNumber(num);
            }

            System.out.println("Congratulations. You " +
                            "guessed the number!");
        }
    }

    public static int guess() {
        return ( (int) (1 + Math.random()*1000) );
    }

    public static boolean checkNumber(int a){
      int ans = guess();
      if (a < ans)
      {
          System.out.println("low");
          return false;
      }
      else if (a > ans)
      {
          System.out.println("high");
          return false;
      }
      else
          return true;
    }
}