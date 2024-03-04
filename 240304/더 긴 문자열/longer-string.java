import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] split = str.split(" ");

        int max = 0;
        String answer = "";
        boolean isSame = true;

        for (int i = 0; i < split.length; i++) {
            int len = split[i].length();

            if (max < len) {
                max = len;
                answer = split[i];
            }

            if (i > 0 && split[i].length() != split[i - 1].length()) {
                isSame = false;
            }

        }

        if (isSame) {
            System.out.println("same");
        } else {
            System.out.println(answer + " " + max);

        }


    }
}