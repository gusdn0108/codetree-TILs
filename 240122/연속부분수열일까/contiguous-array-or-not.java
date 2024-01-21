import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] arr2 = new int[b];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            boolean success = true;
            for (int j = 0; j < b; j++) {
                if(i+j >= b){
                    success= false;
                    break;
                }

                if(arr[i+j]!= arr2[j]){
                    success= false;
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