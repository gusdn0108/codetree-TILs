import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr =new String[n];

        int lenAll = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            int len = arr[i].length();
            lenAll += len;
        }



        for (int i = 0; i < n; i++) {
            if(arr[i].charAt(0)=='a'){
                count++;
            }
        }

        System.out.print(lenAll+" "+count);


    }
}