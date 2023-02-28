// Java code to demonstrate star patterns
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
