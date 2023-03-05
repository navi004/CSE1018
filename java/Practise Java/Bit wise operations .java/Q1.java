//java program the bitwise operations
import java.util.*;
public class bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the b value:");
        int b = input.nextInt();
        String bin_a = Integer.toBinaryString(a);
        String bin_b= Integer.toBinaryString(b);

        System.out.println("Binary of a is : "+ bin_a);   //binary  a : 101
        System.out.println("Binary of b is : "+ bin_b);   // binary b : 111
        int c = a & b; // binary: 101 & 111 = 101 (decimal: 5)
        System.out.println("a & b = " + c);
        
        // bitwise OR
        int d = a | b; // binary: 101 | 111 = 111 (decimal: 7)
        System.out.println("a | b = " + d);
        
        // bitwise XOR
        int e = a ^ b; // binary: 101 ^ 111 = 010 (decimal: 2)
        System.out.println("a ^ b = " + e);
        
        // bitwise NOT
        int f = ~a; // binary: ~101 = 11111111111111111111111111111010 (decimal: -6)
        System.out.println("~a = " + f);
        
        // left shift
        int g = a << 2; // binary: 101 << 2 = 10100 (decimal: 20)
        System.out.println("a << 2 = " + g);
        
        // right shift
        int h = b >> 1; // binary: 111 >> 1 = 11 (decimal: 3)
        System.out.println("b >> 1 = " + h);
        
        // unsigned right shift
        int i = -5; // binary: 11111111111111111111111111111011 (decimal: -5)
        int j = i >>> 1; // binary: 01111111111111111111111111111101 (decimal: 2147483645)
        System.out.println("-5 >>> 1 = " + j);
    }
}
