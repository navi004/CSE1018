//java programn to print stars in butterlfly pattern
/*

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 
 */

 import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n = input.nextInt();

        //loop to print the upper part of the pattern
        for(int i=1; i<=n; i++) {
            //loop to print the upper top part of the pattern
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //loop to print the spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //loop to print the left portion of pattern
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //to end line after each row
            System.out.println();
        }
            // loop to print the lower part of the pattern
        for(int i=n; i>=1; i--) {
                //loop to print the left part of the pattern
            for(int j=1; j<=i; j++) {
                    System.out.print("*");
            }
            //loop to print the spaces
             int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
            }
            //loop to print the left portion of pattern
            for(int j=1; j<=i; j++){
                    System.out.print("*");
            }
            //to end line after each row
                System.out.println();
        }
        
    }
}
