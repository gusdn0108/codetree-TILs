import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArray = str.toCharArray();
        charArray[1] ='a';
        charArray[charArray.length-2] ='a';
        String s = String.valueOf(charArray);
        System.out.println(s);
    }
}