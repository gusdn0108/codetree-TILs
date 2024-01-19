import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[10];
        arr[1] = a;
        arr[2] = b;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i-2]+arr[i-1])%10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
//        arr[1] =
//        arr[2] = 1;
//
//        // 3번째 항부터 10번째 항까지 추가
//        for (int i = 3; i < 11; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//
//        // 10번째 항 출력
//        System.out.println(arr[10]);
    }
}