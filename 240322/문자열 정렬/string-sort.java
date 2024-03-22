import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        String sortedStr = new String(charArray);
        System.out.println(sortedStr);
    }

}