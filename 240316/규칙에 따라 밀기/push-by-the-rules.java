import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        String command = sc.next();
        int length = command.toCharArray().length;

        for (int j = 0; j < length; j++) {
            if (command.charAt(j) == 'L') {
                str = str.substring(1) + str.charAt(0);
            }else if (command.charAt(j) == 'R') {
                str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);
    }


}