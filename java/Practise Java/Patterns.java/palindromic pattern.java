//java program to print stars in palendromic pattern with numbers
/*
    1
   212
  32123
 4321234
543212345
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
            for(int j=i; j>=1; j--) {
                System.out.print(j + "");
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j + "");
            }
            //to end line after each row
            System.out.println();
        }
    }
}
