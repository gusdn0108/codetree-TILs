import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        String str = Integer.toString(sum);
        int len = str.length();

        str = str.substring(1,len-1)+str.substring(0,1);

        System.out.println(str);

    }
}