import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int k  = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                k = i;
                break;
            }
        }

        System.out.println(arr[k-3]+arr[k-2]+arr[k-1]);
    }
}