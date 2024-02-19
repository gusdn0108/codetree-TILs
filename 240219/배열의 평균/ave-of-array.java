import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[2][4];
        int sum = 0;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            sum =0;
            for (int j = 0; j < 4; j++) {
                sum += arr2d[i][j];
            }
            System.out.printf("%.1f ",(double) sum / 4);
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 2; i++) {
                sum += arr2d[i][j];
                System.out.printf("%.1f ",(double) sum /4);
            }
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <4 ; j++) {
               sum += arr2d[i][j];
                System.out.printf("%.1f ",(double) sum / 8);
            }
        }

    }
}