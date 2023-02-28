//java program to print the solid rectangular pattern of stars
/* * * * * *
   * * * * *
   * * * * *
   * * * * *
 */
import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        System.out.println("Enter the number of columns:");
        int m = input.nextInt();
        //outer for loop for rows 
        for(int i=1;i<=n; i++) {
            //inner for loop for columns or number of stars in each row
            for(int j=1; j<=m; j++) {
                System.out.print("* ");
            }
            //to end the line after each row
            System.out.println("");
        }
    }
}
