import java.util.*;
class LeapYear {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       if(n%400 == 0 && n%4 == 0 && n%100 == 0) {
         System.out.println("The given number is a leap year");
         }
         else {
         System.out.println("The given number is not a leap year");
              }
            }
          }
