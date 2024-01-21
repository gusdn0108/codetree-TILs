import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char s = sc.next().charAt(0);
        boolean isContain = false;


        for(int i =0; i < arr.length;i++ ){
            if(arr[i] == s){
                isContain = true;
                System.out.print(i);
            }
        }

        if(!isContain){
            System.out.print("None");
        }


    }


}