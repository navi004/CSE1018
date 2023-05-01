import java.util.*;

public class Demoo {
    public static void main(String[] args) {
        // Wrapper classes in Java are classes that encapsulate primitive data types. 
        //They are used when a primitive data type is required to be treated as an object.
        //Wrapper classes provide a way to convert primitive data types to objects and perform various operations on them.
        int n1 = 1049;
        Integer num1 = n1;  //Auto-boxing : automatic coversion of primitive type to (object type) corresponding wrapper class

        double d1 = 20.0000;
        Double do1 = d1;

        float f1 = 30.6F;
        Float fo1 = f1;

        char c1 = 'n';
        Character ch1 = c1;

        byte b1 = 4;
        Byte by1 = b1;

        short s1 = 14;
        Short sh1 = s1;

        long l1 = 2022722804;
        Long lo1 = l1;

        boolean bo1 = true;
        Boolean bool = bo1;
        //Auto unboxing : automatic coversion of wrapper class(object type) to its corresponding primitive type
        int n2 = num1;
        double d2 = do1;
        float f2 = fo1;
        char c2 = ch1;
        byte b2 = by1;
        short s2 = sh1;
        long l2 = lo1;
        boolean bo2 = bool;
        System.out.println(n2);
        System.out.println(d2);
        System.out.println(f2);
        System.out.println(c2);
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(l2);
        System.out.println(bo2);

    }
}
