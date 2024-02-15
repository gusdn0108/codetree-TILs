import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int[] countArr = new int[11];

        for (int i = 1; i < 10 ; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 1; i <= 10 ; i++) {
            countArr[arr[i]]++;
        }


        for (int i = 1; i < 10; i++) {
            System.out.println(i+" - "+countArr[i]);

        }

    }
}