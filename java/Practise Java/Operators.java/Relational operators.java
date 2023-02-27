//Java relational operators
// Relational operators are used to check the relationship between two operands
//Java program to illustrate the usage of relational operators - >, <, >=, <=, ==
//It returns a boolean value as output - true or false

import java.util.*;
//Create a new class
public class RelationalOperators {
    //Initialize the main() method
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        //Print the three values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //Perform the relational operations and print the result - true or false
        System.out.println("a < b is " + (a<b));
        System.out.println("a > b is " + (a>b));
        System.out.println("a == c is " + (a==c));
        System.out.println("a <= c is " + (a<=c));
        System.out.println("a >= b is " + (a>=b));
        System.out.println("b != c is " + (b!=c));
        System.out.println("b == a+c is " + (b==a+c));
    }
}
