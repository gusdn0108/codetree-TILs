import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = sc.nextInt();
        }

        sum += array[3]+array[5]+array[9];

        System.out.println(sum);

    }
}