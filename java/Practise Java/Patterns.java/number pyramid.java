//java program to print stars in solid rhombus pattern
/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 */

import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n = input.nextInt();
        for(int i=1; i<=n; i++) {
            //loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //loop for printing the stars
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            //to end line after each row
            System.out.println();
        }
    }
}
