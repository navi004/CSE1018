//Dice problem : 
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int max_score = input.nextInt();
        System.out.println("Let us start the game");
        int a2,b2,count = 1 ;
        int suma2 = 0,sumb2 = 0;
        
        while((suma2 < max_score)&&(sumb2 < max_score)) {
            System.out.println("Game number:"+ count);
            double a1 = Math.random() * 100;
            a2 = (int)a1;
            a2 = (a2%6) + 1;
            //System.out.println("A's turn - A's score: " + suma2);
            
            double b1 = Math.random() * 100;
            b2 = (int)b1;
            b2 = (b2%6)+1;
            //System.out.println("B's turn - B's score: "+b2);
            count++;
            suma2 = suma2 + a2;
            sumb2 = sumb2 + b2; 
            System.out.println("A's turn - A's score: "+suma2);
            System.out.println("B's turn - B's score: "+sumb2);
        }
        if(suma2>sumb2) {
            System.out.println("A is winner");
        }
        else {
            System.out.println("B is winner");
        }
    }
}
