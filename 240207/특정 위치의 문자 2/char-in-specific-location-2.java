import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];
        String sum = "";
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            if(i == 1){
                sum += arr[i]+" ";
            }

            if(i == 4){
                sum += arr[i]+" ";
            }

            if(i == 7){
                sum += arr[i]+" ";
            }
        }

        System.out.print(sum);




    }
}