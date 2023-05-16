import java.util.*;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 100;

        try {
            System.out.println(b/a);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("Divided by zero");
        }
        finally {
            System.out.println("End");
        }
    }
}
