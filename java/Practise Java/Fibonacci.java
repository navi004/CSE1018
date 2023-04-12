import java.util.*;
public class Fibonacci {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value");
        int num = input.nextInt();
        int first_term = 0;
        int second_term = 1;
        int next_term;

        for(int i=1; i<=num; i++) {
            System.out.print(first_term + " ,");
            next_term = first_term + second_term;
            first_term = second_term;
            second_term = next_term;
        }
    }
}
