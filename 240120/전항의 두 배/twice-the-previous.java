import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr[0] = n;
        arr[1] = m;

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i-1] + (arr[i-2]*2);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}