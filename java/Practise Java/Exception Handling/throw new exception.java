import java.util.*;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = input.nextInt();
        int p_price = input.nextInt();
        int remaining_balance = balance - p_price;

        try {
            if(balance > p_price)
                System.out.println("Balance Amount after purchase : "+remaining_balance);
            else {
                throw new Exception("Insufficient Balance");
            }
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("You don't have enough money bruh!!");
        }
        finally {
            System.out.println("Leave the shop");
        }
    }
}
