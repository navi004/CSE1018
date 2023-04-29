import java.util.*;

public class Demoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<s.length()-2;i++) {
            if(sb.charAt(i) == sb.charAt(i+1) && sb.charAt(i+1) == sb.charAt(i+2)) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}
