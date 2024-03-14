import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();

        str1 = str.substring(0,1)+str1.substring(2);

        System.out.println(str1);
    }
}