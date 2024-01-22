import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] == arr[i] ){
                cnt++;
            }
        }


        if(cnt > 1){
            System.out.print("-1");
        }else {
            System.out.println(max);

        }



    }
}