import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum =0;
        int cnt =0;
        int numCount =0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] ==0){
                break;
            }

            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            if(arr[i] % 2 ==0){
                sum+=arr[i];
                numCount++;
            }
        }

        System.out.print(numCount+" "+sum);
    }
}