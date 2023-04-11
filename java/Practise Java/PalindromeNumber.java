import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int remainder,reversen = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int originalnum = n;
        while(n!=0) {
            remainder = n%10;
            reversen = (reversen * 10) + remainder;
            n = n/10;
        }
        System.out.println("The original number is " + originalnum);
        System.out.println("The reversed number is "+reversen);
        if(originalnum == reversen) {
            System.out.println("The given number is a palindrome");
        }
        else {
            System.out.println("The given number is not a palindrome");
        }
    }
    
}
