import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum =0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== 0){
                break;
            }
            sum+= arr[i];
        }

        System.out.println(sum);
    }
}