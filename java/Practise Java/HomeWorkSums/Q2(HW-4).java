
public class Student{      
 
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
           
           // Accessing and property value
           student1.name = "John";
           student1.rollno = 1;
           student1.address = "TEXAS";
           student1.phonenumber = "9876543210";     
           student2.name = "Nick";
           student2.rollno = 2;
           student2.address = "MELBOURNE";
           student2.phonenumber  = "1234567890";
           // Calling method
           student1.info();
           student2.info();
           
       }
    String name,address,phonenumber;
    int rollno;  
   
   
   void info(){
     System.out.println("Name: "+name);
     System.out.println("Roll Number: "+rollno);
     System.out.println("phone Number: "+phonenumber);
     System.out.println("Address :"+ address);
   }
}  
   
