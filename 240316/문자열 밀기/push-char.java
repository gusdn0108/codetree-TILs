import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        str = str.substring(len-1,len) + str.substring(0,len-1);

        System.out.println(str);



    }
}