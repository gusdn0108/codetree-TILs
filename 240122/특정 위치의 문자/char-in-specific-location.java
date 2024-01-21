import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        String s = sc.next();
        String none = "None";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==s.charAt(0)){
                System.out.print(i);
                break;
            }else {
                System.out.print(none);
                break;
            }

        }



    }


}