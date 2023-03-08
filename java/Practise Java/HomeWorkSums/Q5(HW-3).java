//java code to print pascal's triangle 
/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
 */
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = input.nextInt();

        // loop through each row of Pascal's triangle
        for (int i = 0; i < n; i++) {
            // print spaces before each row
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            // calculate and print each element of the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // calculate the next number using the formula
                number = number * (i - j) / (j + 1);
            }

            // move to the next line
            System.out.println();
        }
    }
}

