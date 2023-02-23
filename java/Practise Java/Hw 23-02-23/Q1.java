//to determine the sum of harmonic series upto given input
import java.util.Scanner;

class Firstclass {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      
      double i,sum = 0;
      for(i=1;i<=n;i++) {
         sum = sum + 1/i;
      }
      System.out.println("sum = " + sum);
   }
}
