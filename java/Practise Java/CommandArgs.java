

//Java progran to demonstrate the usage of Command line arguments
//We use "javac CommandArgs.java" to compile the Java program
//We use "java CommandArgs" to run the program and view the output
//Do you know that we can also pass arguments in this "java CommandArgs"
//For example, "java CommandsArgs name1 name2"
//Now, your args[] array will have the value as ["name1", "name2"]
//Let's write this Java program to check it out
// to take input and print it without using the scanner method
import java.lang.*;

class CommandArgs {
      public static void main(String[] args) {
      int count,i=0;
      String string; 
            //Declaring a dummy string to print your array of inputs within a while loop
      count = args.length; 
            //To find the number of elements in an array named "args", we use the syntax "args.length"
      System.out.println("The number of arguements you have passed is " + count); // to print length of string
      
      while(i<count) {
            string = args[i];
            i++;
            System.out.println(string); // to print the string
            }
         }
     }
  //it will take input while running the code
