import java.util.*;
class Travel {
    int speed,duration;
    int distance = 300;
    
    public void startTheCar() {
        System.out.println("VIT CHENNAI");
    }
    public void calculateTravelTime(int speed) {
        duration = distance / speed;
        System.out.println(duration + " hours");
    }
    public void stopTheCar() {
        System.out.println("GOOGLE BANGALORE");
    }
}

class Main{
    public static void main(String[] args) {
    Travel object = new Travel();
    Scanner input = new Scanner(System.in);
    int speed = input.nextInt();
    
    object.startTheCar();
    object.calculateTravelTime(speed);
    object.stopTheCar();
    }
}
