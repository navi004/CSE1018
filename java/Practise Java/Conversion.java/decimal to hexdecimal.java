//java program to convert decimal to hex decimal
//importing required packages
import java.lang.*;   //Integer.toHexString() method is in lang package 
import java.util.*;   //for Scanner method
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value:");    //taking input in decimal integer
        int decimalnum = input.nextInt();
        String hexString = Integer.toHexString(decimalnum); 
        System.out.println("Value in Hexadecimal :" + hexString);

    }
}
