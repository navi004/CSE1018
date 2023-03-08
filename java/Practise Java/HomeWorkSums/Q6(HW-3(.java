import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value:"); // Ask user for input
        int n = input.nextInt(); // Get integer input from user

        // Outer loop to iterate n times to generate each row of the pyramid
        for(int i=1; i<=n; i++) {
            // Inner loop to print spaces to center the pyramid
            for(int j=1; j<=n-i; j++) {
                System.out.print("  "); // Print two spaces
            }
            // Inner loop to print the numbers in ascending order from i to 2i-1
            for(int j=i; j<=2*i-1; j++) {
                System.out.print(j + " "); // Print the number followed by a space
            }
            // Inner loop to print the numbers in descending order from 2i-2 to i
            for(int j=2*i-2; j>=i; j--){
                System.out.print(j + " "); // Print the number followed by a space
            }
            System.out.println(); // Move to next line for the next row
        }
    }
}
