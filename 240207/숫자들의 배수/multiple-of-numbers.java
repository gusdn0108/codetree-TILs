import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i < 11; i++) {
            arr[i] = n * i;
            if(arr[i] % 5 == 0){
                cnt++;
            }
            if( cnt == 2){
                break;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}