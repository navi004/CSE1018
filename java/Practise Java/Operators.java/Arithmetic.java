//Java program to check basic arithmetic operations like +,-,*,/,% on floating point numbers
import java.util.*;
public class FloatArithmetic {
    //Initialize the main() method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Initialize three float values to perform relational operations
      System.out.println("Enter first value:");
        float a = input.nextFloat();
      System.out.println("Enter the second value:");
        float b = input.nextFloat();
      
        //Print the tw input values
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Perform the relational operations and print the result
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));
    }
}
