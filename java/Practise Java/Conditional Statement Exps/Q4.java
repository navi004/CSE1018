//create a basic calculator with basic operators using switch
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Choose the operator +,-,*,/");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(n1+n2);
            break;
            case '-' : System.out.println(n1-n2);
            break;
            case '*' : System.out.println(n1 * n2);
            break;
            case '/' : System.out.println(n1 / n2);
            break;
            case '%' : System.out.println(n1 % n2);
            break;
            default : System.out.println("Invalid input");
        }
        sc.close();
    }
}
