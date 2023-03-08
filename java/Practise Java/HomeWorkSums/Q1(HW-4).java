public class Student{      
 
    String name;
    int rollno;

    
   void info(){
     System.out.println("Name: "+name);
     System.out.println("Roll Number: "+rollno);
   }  
   
   
   public static void main(String[] args) {
       Student student = new Student();
       
       // Accessing and property value
       student.name = "John";
       student.rollno = 2;
       
       // Calling method
       student.info();
       
   }
}  
 
                 OR 


public class Student {
  void info(String name, int rollno) {
    System.out.println("NAME:"+name);
    System.out.println("Rollno:"+rollno);
  }
  public static void main(String[] args) {
    String name = "John";
    int rollno = 2;
    Student obj = new Student();
    obj.info(name,rollno);

  }
}
