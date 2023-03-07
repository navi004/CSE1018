import java.util.*;

//java program to add two numbers with a function
public class Firstclass {

    //Sum  function   
    public static int  calculateSum(int a, int b) {
        return a+b;
    }   
    
    public static void main(String args[]) {
        //input from the user
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println(calculateSum(a, b));
   }
}
