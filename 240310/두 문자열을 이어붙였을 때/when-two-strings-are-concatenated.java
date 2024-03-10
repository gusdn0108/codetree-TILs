import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        String convert = str1+str;
        if ((str + str1).equals(convert)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}