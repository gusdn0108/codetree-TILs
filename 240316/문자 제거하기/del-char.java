import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        // hello
        int len = str.length();

        while(len > 1){
            int convert = sc.nextInt();

            if(convert >= len){
                convert = len -1;
            }

            str = str.substring(0,convert)+str.substring(convert+1);
            len--;

            System.out.println(str);

        }






    }
}