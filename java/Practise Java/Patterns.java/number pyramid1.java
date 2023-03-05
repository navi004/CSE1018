//java program to print numbers in pyramid pattern
/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = input.nextInt();
        
        //loop for rows 
        for(int i=1; i<=n; i++) {
        //loop for printing stars
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            //loop for printing the numbers upto middle term
            for(int j=i; j<=2*i-1; j++) {
                System.out.print(j + " ");
            }
            //loop for printing the numbers after the middle term
            for(int j=2*i-2; j>=i; j--){
                System.out.print(j + " ");
            }
            //to end row after each line 
            System.out.println();
        }
    }
}
