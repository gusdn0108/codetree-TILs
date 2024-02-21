import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][m];
        int[][] exArr2d = new int[n][m];
        int[][] answerArr = new int[n][m];

        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                exArr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr2d[i][j] == exArr2d[i][j]){
                    answerArr[i][j] = num;
                }else {
                    answerArr[i][j] = num + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answerArr[i][j] + " ");
            }
            System.out.println();
        }



    }
}