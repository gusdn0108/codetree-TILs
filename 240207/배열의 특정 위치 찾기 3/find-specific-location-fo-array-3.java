import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if( arr[i] ==0){
                break;
            }
        }


        System.out.print(sum);



    }
}