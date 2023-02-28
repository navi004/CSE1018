// Java code to demonstrate star pattern
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
import java.io.*;
import java.util.*;

public class Firstclass {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the n value:");
      int n = input.nextInt();
      
     // outer loop to handle number of rows
        //  n in this case
      for(int i=1;i<=n;i++) {
        
          // inner loop to handle number spaces
            // values changing acc. to requirement
         for(int j=n;j>=1;j--) {
            // printing spaces
            System.out.print(" ");
         }
        
         //  inner loop to handle number of columns
            //  values changing acc. to outer loop
         for(int j=1;j<=i;j++) {
            // printing stars
            System.out.print("* ");
         }
        // ending line after each row
         System.out.println();
      }
   }
}
