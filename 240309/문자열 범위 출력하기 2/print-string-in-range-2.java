import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        // FunLeeBrosCode
        int n = sc.nextInt();
        // 11

        int cov = str.length()-n;

        for (int i = str.length()-1; i >= cov; i--) {
            if(str.length() > n){
                System.out.print(str.charAt(i));
            }
        }


    }
}