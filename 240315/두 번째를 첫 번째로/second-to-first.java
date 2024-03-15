import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char c = str.charAt(1);
        char convert = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== c){
               str = str.substring(0,i)+convert+str.substring(i+1);
            }
        }

        System.out.println(str);

    }
}