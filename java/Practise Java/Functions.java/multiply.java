
import java.util.*;


public class Functions {


   //Function to Multiply 2 numbers
   public static int multiply(int a, int b) {
       return a*b;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      //prompt the user to give input
       int a = sc.nextInt();
       int b = sc.nextInt();


       int result = multiply(a, b);
     //printing the result
       System.out.println(result);
   }
}
