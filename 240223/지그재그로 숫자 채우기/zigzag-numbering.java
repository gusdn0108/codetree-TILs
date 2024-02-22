import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2d = new int[n][m];
        int num = 0;
        for (int col = 0; col < m; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < n; row++) {
                    arr2d[row][col] = num;
                    num++;
                }
            }else {
                for (int row = n-1; row >= 0 ; row--) {
                    arr2d[row][col] = num;
                    num++;
                }
            }
        }

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println();
        }


    }
}