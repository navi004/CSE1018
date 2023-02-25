import java.util.Scanner;

 class StudentMarks {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
   
    System.out.println("Enter the number of students :\n");
   int No_of_students = input.nextInt();
   System.out.println("Enter roll number of the student :\n");
   int Roll_no = input.nextInt();
    System.out.println("Enter your name :\n");
   String Name = input.next();
    System.out.println("Enter the department of the student :\n");
   String Dept = input.next();
    System.out.println("Enter the sem number:\n");
   String sem = input.next();
    System.out.println("Enter the marks in Maths:\n");
   int mark1 = input.nextInt();
    System.out.println("Enter the marks in Physics :\n");
   int mark2 = input.nextInt();
    System.out.println("Enter the marks in Chemistry :\n");
   int mark3 = input.nextInt();
   
   int total = mark1 + mark2 + mark3;
   
   double average = total / 3;
   
   char Grade ;
   
   if(average >= 95.00) {
     System.out.println(" S Grade\n");
     }
   else if(average >= 90.00 && average <= 94) { 
     System.out.println("A grade\n");
     }
   else 
      System.out.println("Invalid Grade");
      }
      input.close();
   }
