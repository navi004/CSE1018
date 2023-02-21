import java.util.*;
public class Bool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Are you 18 ?");
       
        boolean a = input.nextBoolean();
    
        
        if(a == true) {
        System.out.println("i am 18");
        }
        else {
        System.out.println("I am not 18");
        }
    }
}
