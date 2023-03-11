//java program to create function to create a multiplication table
import java.util.*;

public class Class {
  public static void m_table(int n) {
    for(int i=1; i<=10; i++) {
      int product = n * i;
      System.out.println(n + " * " + i + " = " + product);
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the n value:");
    int n = input.nextInt();
    m_table(n);
  }
}
