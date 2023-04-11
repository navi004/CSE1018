import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = input.nextLine();
        String reversed_s = "";
        int n = s.length();
        for(int i=n-1; i>=0; i--) {
            reversed_s = reversed_s + s.charAt(i);
        }
        System.out.println("The original string is "+s);
        System.out.println("The reversed string is "+reversed_s);
        if(s.equalsIgnoreCase(reversed_s)) {
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not a palindrome");
        }
    }
}
