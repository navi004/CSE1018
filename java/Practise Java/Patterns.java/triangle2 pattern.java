//java program to print stars in pyramid pattern withithout space between each star
/*
    *
   ***
  *****
 *******
*********
 */
import java.util.*;
public class Patterns {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = input.nextInt();
     
     //outer loop for number of rows
        for(int i=1; i<=n; i++) {

         //loop for printing the spaces
             for(int j=1; j<=n-i; j++) {

                 System.out.print(" ");
                }
         //loop to print stars on left side
             for(int j=1; j<=i; j++) {
                 System.out.print("*");
                }
             for(int j=2; j<=i; j++)  {
         //loop to print stars on right side
                 System.out.print("*");
                }
         //to end the after each row
        System.out.println("");
        }
    }
}

             OR
             

//java program to print stars in pyramid pattern
/*
    *
   ***
  *****
 *******
*********
 */
import java.util.*;
public class Patterns {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = input.nextInt();
     
     //outer loop for number of rows
        for(int i=1; i<=n; i++) {
 
         //loop for printing the spaces
             for(int j=1; j<=n-i; j++) {

                 System.out.print(" ");
                }
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






