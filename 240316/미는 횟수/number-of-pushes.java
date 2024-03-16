import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();
        int cnt = 0;

        int len = str1.length();


        for (int i = 0; i < str.length(); i++) {
            if(str.equals(str1.substring(i,len) + str1.substring(0,i))){
                cnt = i;
                break;
            }
            if (!str1.equals(str.substring(i, len) + str.substring(0, i))) {
                cnt = -1;
            }

        }

        System.out.println(cnt);

    }
}