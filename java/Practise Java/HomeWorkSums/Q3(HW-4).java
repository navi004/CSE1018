//java program to print the area and perimeter of the triangle with methods 
public class Triangle {
    double a,b,c;
      
    //constructor with no  parameters
    public Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }
    //method to calculate Perimeter
    public double getPerimeter() {
        return a+b+c;
    }
    //method to calculate the area
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    //main method
    public static void main(String[] args) {
        Triangle obj = new Triangle();

        System.out.println("Perimeter:" + obj.getPerimeter()); 
        System.out.println("Area:"+ obj.getArea());
    }
}
