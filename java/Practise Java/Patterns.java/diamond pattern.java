//java program to print stars in diamond pattern
/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */
import java.util.*;
public class Patterns {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = input.nextInt();
     
     
       //outer loop for number of rows of top part
       for(int i=1; i<=n; i++) {
 
        //loop for printing the spaces
            for(int j=1; j<=n-i; j++) {

                System.out.print(" ");
               }
        //loop for printing stars in top part
        //print stars with odd number formula odd number = 2*i-1,where i is any integer
            int spaces = 2*i-1;
            for(int j=1; j<=spaces; j++) {
                System.out.print("*");
               }
        //to end the after each row
       System.out.println("");
       } 
       //outer loop for number of rows of bottom part
       for(int i=n; i>=1; i--) {
 
        //loop for printing the spaces
            for(int j=1; j<=n-i; j++) {

                System.out.print(" ");
               }
        //loop for printing stars in bottom part
        //loop to print stars with odd number formula odd number = 2*i-1,where i is any integer
            int spaces = 2*i-1;
            for(int j=1; j<=spaces; j++) {
                System.out.print("*");
               }
        //to end the after each row
       System.out.println("");
       }
    }
}
