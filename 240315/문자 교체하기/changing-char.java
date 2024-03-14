import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();

        char[] charArray = str.toCharArray();
        char[] charArray1 = str1.toCharArray();
        char temp =' ';
        char temp1 = ' ';
        charArray[0] = temp;
        charArray[1] = temp1;


        charArray1[0] = temp;
        charArray1[1] = temp1;

        String s = String.valueOf(charArray1);
        System.out.println(s);
    }
}