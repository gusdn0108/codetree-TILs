import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static int n;
    public static int[] arrA;
    public static int[] arrB;

    public static boolean equal(){
        for (int i = 0; i < n; i++) {
            if(arrA[i] != arrB[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arrA = new int[n];
        arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if(equal()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}