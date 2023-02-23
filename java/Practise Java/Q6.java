//to find the square root of a number using inbuilt method with input
import java.lang.Math;
import java.util.Scanner;
public class SquareRoot {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
    double a = sc.nextDouble();
    double b = Math.sqrt(a);
    System.out.println("The square root of " + a + " is " + b);
      }

    }
