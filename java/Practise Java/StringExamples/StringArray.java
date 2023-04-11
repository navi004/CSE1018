public class StringArray {
  public static void main(String[] args) {
      String[] strAr1=new String[] {"Ani", "Sam", "Joe"}; //inline initialization  
      String[] strAr2 = {"Ani", "Sam", " Joe"};  
      String[] strAr3= new String[3]; //Initialization after declaration with specific size  
      strAr3[0]= "Ani";  
      strAr3[1]= "Sam";  
      strAr3[2]= "Joe"; 
      for(int i = 0; i<=strAr1.length(); i++) {
        System.out.println(strAr1[i]);
      }
  }
}
