import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2d = new int[100][100];
        int num = 1;

        for (int startCol = 0; startCol < m; startCol++) {
            int currRow =0;
            int currCol = startCol;

            while (currCol >= 0 && currRow < n){
                arr2d[currRow][currCol]= num;

                currRow++;
                currCol++;
                num++;
            }
        }

        for (int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m -1;

            while (currCol >= 0 && currRow < n){
                arr2d[currRow][currCol] = num;

                currRow++;
                currCol--;
                num++;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }


    }
}