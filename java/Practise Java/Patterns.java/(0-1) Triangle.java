//java program to print 0-1 triangle
/*
1
01
101
0101
10101
 */
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = input.nextInt();
         
        //outer loop is for number of rows
        for(int i=1; i<=n;  i++) {
             
            //inner loop is for number of columns
            //cell--> (i,j) using the matrix method
            for(int j=1; j<=i; j++) {
                int sum = i+j;         // assinging the sum to sum of i and j
               if(sum % 2 == 0) {
                System.out.print("1");    //print 1 if sum is even
               }
               else {
                System.out.print("0");    //print 0 if sum is odd
               }
            }
            //to end the line after each row
            System.out.println("");
        }
    }
}
