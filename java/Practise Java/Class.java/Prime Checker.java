
//java program to check whether a number is prime or not
import java.util.*;
  public class Class {

    public boolean Prime_or_not(int n) {
      if(n<=1) {
        return false;
      }
      for(int i=2; i<=Math.sqrt(n); i++) {
        if(n%i==0) {
          return false;
        }
      }
      return true;
    }
    public static void main(String[] args) {
      Class obj = new Class();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number :");
      int n = input.nextInt();
      if(obj.Prime_or_not(n)) {
        System.out.println(n +" is prime number");
      }
      else {
        System.out.println(n + " is not a prime number");
      }
    }
  }

