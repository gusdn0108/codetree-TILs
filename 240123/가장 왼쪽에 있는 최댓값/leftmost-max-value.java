import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        while (n>0){
            int max = arr[0];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
            }

            for (int i = 0; i < n; i++) {
                if(max == arr[i]){
                    idx = i;
                    break;
                }
            }

            n = idx;

            System.out.print(idx+1+" ");

        }

    }
}