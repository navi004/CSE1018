//to convert money in rupees(decimal) to paises(int) using Type casting
import java.util.Scanner;

class Firstclass {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the money in rupees :\n");
     double n = input.nextDouble();
     int n1 = (int)(n * 100);   //double is changed to int
   System.out.println("Money in paises : " + n1);
   }
}
