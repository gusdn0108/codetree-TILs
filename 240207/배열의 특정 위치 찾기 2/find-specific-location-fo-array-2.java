import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int sum =0;
        int sum2 =0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 ==0){
                sum += arr[i];
            }else {
                sum2 += arr[i];
            }
        }



        if( sum >= sum2 ){
            System.out.print(sum - sum2);
        }else {
            System.out.print(sum2 - sum);
        }







    }
}