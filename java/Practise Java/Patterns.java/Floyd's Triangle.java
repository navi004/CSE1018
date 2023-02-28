//java program to print Floyd's Trangle
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */
import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value");

        int n = input.nextInt();   //taking input

        int number = 1;  

        //outer loop for number of rows
        for(int i=1; i<=n; i++) {

            //inner loop for printing the numbers
            for(int j=1; j<=i; j++){

            System.out.print(number + " ");
            number++;  //increasing the number at each iteration
            }
            
            //to end line at each row
        System.out.println("");
        }
    }
}
