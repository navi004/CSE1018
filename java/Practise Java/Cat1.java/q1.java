//Conversion of days into years,weeks and days
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int years = 0;
        int weeks = 0;
        int days = 0;
        if(n%365>=0) {
            years = n/365;
            if(n-365*years > 7) {
                weeks = (n-365*years)/7;
            } 
            if((n-365*years > 0) && (n-365*years < 7)) {
                days = n-365*years;
            }
        }
        if((n<365) && (n>7)) {
            weeks = n/7;
            if(n-weeks*7 > 0) {
                days = n-weeks*7;
            }
        }
        if(n<7) {
            days = n;
        }
        System.out.println(years+" years ,"+weeks+" weeks and "+days+" days");
    }
}
