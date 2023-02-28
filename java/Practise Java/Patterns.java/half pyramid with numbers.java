//java program to print numbers in half pyramid pattern
/*
 1
 12
 123
 1234
 12345
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
            for(int j=1; j<=i; j++) {
                System.out.print(j);  //printing the j value at each iteration
            }
            //to end the line after each row
            System.out.println("");
        }
    }
}
