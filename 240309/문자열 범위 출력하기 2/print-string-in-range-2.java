import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        if (n < str.length()) {
            System.out.println(str);
        } else {

            int cov = str.length() - n;
            int len = str.length() - 1;

            for (int i = len; i >= cov; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}