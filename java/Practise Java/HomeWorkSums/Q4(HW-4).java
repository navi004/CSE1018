public class Triangle {
   //java program to print the area and perimeter of triangle using methods with constructors 
// instance variables to store the lengths of the sides of the triangle
    int a, b, c;

    // constructor to initialize the instance variables with the values of the sides
    public Triangle(int a, int b, int c) {
        // use 'this' keyword to refer to the instance variables of the class
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // method to calculate the perimeter of the triangle
    public double getPerimeter() {
        return a + b + c;
    }

    // method to calculate the area of the triangle using Heron's formula
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // main method to create an object of the Triangle class and call its methods
    public static void main(String[] args) {
        // create a Triangle object with sides of length 3, 4, and 5
        Triangle triangle = new Triangle(3, 4, 5);

        // print the perimeter of the triangle using the getPerimeter method
        System.out.println("Perimeter: " + triangle.getPerimeter());

        // print the area of the triangle using the getArea method
        System.out.println("Area: " + triangle.getArea());
    }
}
