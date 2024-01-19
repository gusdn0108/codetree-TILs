import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if( i%2 ==0 ){
                sum += arr[i];
            }else {
                sum2 += arr[i];
            }
        }
        

        if( sum > sum2) {
            System.out.println(sum-sum2);
        }

        if( sum2  > sum){
            System.out.println(sum2 - sum);
        }
    }
}