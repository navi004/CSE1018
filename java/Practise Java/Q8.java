
// to take input and print it without using the scanner method
import java.lang.*;

class CommandArgs {
      public static void main(String[] args) {
      int count,i=0;
      String string;
      count = args.length;  //
      System.out.println("The number of arguements you have passed is " + count); // to print length of string
      
      while(i<count) {
            string = args[i];
            i++;
            System.out.println(string); // to print the string
            }
         }
     }
