import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        int[][] exArr2d = new int[3][3];
        int[][] answerArr = new int [3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                exArr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                answerArr[i][j] += arr2d[i][j] * exArr2d[i][j];
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(answerArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}