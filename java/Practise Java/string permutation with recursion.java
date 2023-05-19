import java.util.*;

public class ExceptionHandling {
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.print(str + " ");
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        permute(str, 0, str.length() - 1);
    }
}
