// to Create method named  Rectangle to find the area of rectangle 
import java.lang.*;
class Rectangle{
    float length,breadth;
    public float findArea(float a, float b) {
        length = a;
        breadth = b;
        float area = length * breadth;
        return area;
    }
}
public class Shape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        float myArea = rect.findArea(12,15.8f);
        System.out.println("Area of your rectangle is " + myArea);
    }
 }



//withn input
import java.lang.*;
import java.util.Scanner;
class Rectangle{
    float length,breadth;
    public float findArea(float a, float b) {
        length = a;
        breadth = b;
        float area = length * breadth;
        return area;
    }
}

public class Shape {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        Rectangle rect = new Rectangle();
        float myArea = rect.findArea(a,b);
        System.out.println("Area of your rectangle is " + myArea);
    }
 }
