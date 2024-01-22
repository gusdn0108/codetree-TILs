import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[100];

        int max1 = 0, max2 = 0, maxIdx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        max1 = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                maxIdx = i;
            }
        }

        boolean isInitialize = false;

        for (int i = 0; i < n; i++) {
            if (i == maxIdx) {
                continue;
            }

            if (isInitialize == false) {
                isInitialize = true;
                max2 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.print(max1 + " "+max2);

    }
}