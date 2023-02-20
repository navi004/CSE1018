import java.util.*;
public class Circle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int diameter = sc.nextInt();
      double radius = diameter / 2;
      double area  = radius * radius * 3.14;
      System.out.println(area);
    }

}
