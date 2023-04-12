//program to check whether a year is leap year
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int leap = input.nextInt();

        if((leap%4 == 0) || (leap%100 == 0 && leap%400 == 0)) {
            System.out.println(leap + " is a leap year");
        }
        else {
            System.out.println(leap +" is not a leap year");
        }
    }
    
}
