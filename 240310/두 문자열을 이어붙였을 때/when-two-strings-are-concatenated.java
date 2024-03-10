import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        String convert = str+str1;
        if ((str + str1+convert).equals(convert)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}