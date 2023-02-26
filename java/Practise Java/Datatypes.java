//Java program to demonstrate the basic datatypes in Java
/* Primitive Data types in Java
 * Integer - byte, short, int, long
 * Floating Point - float, double
 * Character - char
 * Boolean - boolean
 * 
 * Java supports both positive and negative numbers.
 * There is no concept of "unsigned" integers in Java
 * 
 * The memory allocation for each datatype is 
 * byte - 1 byte [1 byte = 8 bits. 2^8=256. So a byte datatype can store 256 values. They are -128 to 127]
 * short - 2 bytes
 * int - 4 bytes
 * long - 8 bytes [You should add 'L' or 'l' at the end while defining a new 'long' value. e.g., long ab = 121218734L]
 * 
 * float - 4 bytes [You should add 'F' or 'f' at the end while defining a new 'float' value. e.g., float ab = 12.34F]
 * double - 8 bytes
 * 
 * char - 1 byte
 * 
 * boolean - 1 bit  (true or false)
 */
   //PRIMITIVE DATA TYPES
public class Lfd {
    public static void main(String[] args) {
        byte myNum = 100; //Byte[-128 to 127]
        
        short s = 5000; //Short size [-32768 to 32767]
        
       float f = 21.55f;  // Floating point number
       
        double d = 21.556677d; 
        // the value should end with an "f" for floats and "d" for doubles
       
        long l = 1000000L;
        //should end the value with an "L"
        
        int a = 12; //integer(Whole number)
        
        char character = 'n' ; //character
        
       boolean isJavafun = true;
       
        System.out.println(f);
       System.out.println(d);
       System.out.println(l);
         System.out.println(s);
          System.out.println(myNum);
         System.out.println(name);
         System.out.println(a);
         System.out.println(isJavafun);
        
       
       }
      }
