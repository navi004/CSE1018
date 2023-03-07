import java.util.*;

public class Firstclass {
    
    // Function to print the factorial of a given number
    public static void PrintFactorial(int n) {
        int factorial = 1;
        
        // Check if the input is negative
        if(n < 0) {
            System.out.println("Invalid input");
            // Exit the function if input is invalid
            return;       
        }
        
        // Calculate the factorial using a for loop
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        
        // Print the result to the console
        System.out.println(n + "! = " + factorial);
        
        // Exit the function
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.println("Enter a number:");
        
        // Read the input from the user
        int n = input.nextInt();
      
        // Call the PrintFactorial function with the input value
        PrintFactorial(n);
    }  
}
