import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] arr =  new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }


        int min = arr[0];
        int max = arr[0];
        int maxAfter = arr[0];

        for (int i = 0; i < 10; i++) {
            if( 500 > arr[i]){
                if(min <  arr[i]){
                    min = arr[i];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if(min < 500 && min < arr[i]){
                max = arr[i];
            }

            if( 500 < max && min < max){
                maxAfter = arr[i];
                break;
            }
        }

        System.out.print(min+" "+maxAfter);






    }
}