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
