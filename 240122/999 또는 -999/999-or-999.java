import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[100];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                arr[i] = arr[i-1];
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
        }

        System.out.println(max);

        System.out.print(max+" "+min);


    }
}