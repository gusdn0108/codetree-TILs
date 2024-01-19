import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] newArr = new int[100];

        int zeroPoint =0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0 ){
                zeroPoint = i;
                break;
            }
            if(arr[i] % 2 ==0){
                newArr[i] = arr[i]/2;
            }else {
                newArr[i] = arr[i] + 3;
            }


        }

        for (int i = 0; i < zeroPoint; i++) {

            System.out.print(newArr[i]+" ");
        }



    }
}