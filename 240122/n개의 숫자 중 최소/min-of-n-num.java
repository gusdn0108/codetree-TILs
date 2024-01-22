import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(min == arr[i]){
                cnt++;
            }
        }




        System.out.print(min+" "+cnt);

    }
}