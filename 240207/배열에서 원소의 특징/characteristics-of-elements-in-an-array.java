import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt =0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if((i+1) % 3 == 0){
                System.out.print(arr[cnt-2]);
                break;
            }
        }






    }
}