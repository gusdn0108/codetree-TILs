import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();

        str = str.substring(len-(len-1),len) + str.substring(len-len,len-(len-1));

        System.out.println(str);



    }
}