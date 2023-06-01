
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Buggati Veyron");
        cars.add("Ford Mustang1969");
        cars.add("Aventedor");
        cars.add("Lamborghini Urus");
    
        Iterator<String> itr = cars.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
