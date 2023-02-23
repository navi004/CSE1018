// to convert temperature in Fahrenheit to Celsius
import java.util.Scanner;

class Firstclass {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the temperature in Fahrenheit :\n");
   double tempF = input.nextFloat();  //taking input 
   double tempC = (tempF-32) / (1.8);   //conversion formula
   System.out.println("Temperature in Celsius =" + tempC + "°C");
   }
}
