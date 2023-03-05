//Type Casting
    /*Explicit Typecasting: Converting from a wider datatype to a narrower datatype
    Datatypes who has higher memory allocation are called wider datatypes
          Imagine a situation, when you met with an accident and gained some weight. Now your 'S' size T-shirt is too tight for you. 
         You have to lose some weight in order to fit in to your S-sized T-shirt. This is called explicit casting
         e.g., 1.2 is a float value. If I convert it into int type, the result will be 1. The 0.2 got omitted in order to convert it into an int type.
         *
         */
       
   import java.util.*;
       class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a floating inetger");
    double num = input.nextDouble();
    System.out.println("The double value: " + num);

   //converting to int
    int data = (int)num;
    System.out.println(" The integer value: " + data);
  }
}

//conversion from int to string
class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value is: " + num);

    // converts int to string type
    String data = String.valueOf(num);
    System.out.println("The string value is: " + data);
  }
}

//conversion from string to intclass Main {
  public static void main(String[] args) {
    // create string type variable
    String data = "10";
    System.out.println("The string value is: " + data);

    // convert string variable to int
    int num = Integer.parseInt(data);
    System.out.println("The integer value is: " + num);
  }
}


