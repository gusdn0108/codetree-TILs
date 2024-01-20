import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[99];
        int[] countArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            if(arr[i] == 0){
                break;
            }

            if(arr[i]<10){
                continue;
            }
            countArr[arr[i]/10]++;

        }

        for (int i = 1; i < countArr.length; i++) {
            System.out.println(i+ " - "+ countArr[i]);
        }


    }
}