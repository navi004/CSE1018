
//java program to check whether a number is even or not

import java.util.*;
  public class Class {

    public boolean isEven(int n) {
      if(n%2==0) {
        return true;
      }
      else {
        return false;
      }
    }
    public static void main(String[] args) {
      Class obj = new Class();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number :");
      int n = input.nextInt();
      if(obj.isEven(n)) {
        System.out.println(n +" is  even number");
      }
      else {
        System.out.println(n + " is not a even number");
      }
    }
  }
