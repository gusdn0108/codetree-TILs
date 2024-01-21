import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[100];
        int[] arr2 = new int[100];

        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            boolean success = true;
            for (int j = 0; j < n2; j++) {
                if(i+j >= n1){
                    success= false;
                    break;
                }

                if(arr[i + j] != arr2[j]) {
                    success = false;
                    break;
                }
            }
            if(success){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        System.out.print("No");
    }
}