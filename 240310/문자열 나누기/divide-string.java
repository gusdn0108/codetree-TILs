import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[10];
        String strAll = "";

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            strAll += arr[i];
        }

        int len = strAll.length();

        for (int i = 0; i < len; i++) {
            System.out.print(strAll.charAt(i));
            if((i+1)%5 == 0){
                System.out.println();
            }
        }


    }
}