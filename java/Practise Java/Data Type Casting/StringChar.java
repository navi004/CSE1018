// to convert any datatype to string using String.valueOf
class Main {
  public static void main(String[] args) {
    int a = 5;
    long l = -2343834L;
    float f = 23.4f;
    double d = 923.234d;

    // convert numbers to strings
    System.out.println(String.valueOf(a));  // "5"
    System.out.println(String.valueOf(l));  // "-2343834"
    System.out.println(String.valueOf(f));  // "23.4"

    System.out.println(String.valueOf(d));  // "923.234"
  }
}


//Convert char and char array to String
class Main {
  public static void main(String[] args) {
    char c = 'J';
    char ch[] = {'J', 'a', 'v', 'a'};

    // convert char to string
    System.out.println(String.valueOf(c));  // "J"


    // convert char array to string
    System.out.println(String.valueOf(ch));  // "Java"

  }
}

//Subarray of a char Array to String
class Main {
  public static void main(String[] args) {
    char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
    int offset = 2;
    int length = 4;
    String result;

    // subarray {'o', 'g', 'r', 'm'} is converted to string
    result = String.valueOf(ch, offset, length);

    System.out.println(result);  // "ogrm"
  }
}

//Convert String to char array
import java.util.Arrays;
public class StringChar {

    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
