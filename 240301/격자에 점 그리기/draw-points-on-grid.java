import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 2
        int m = sc.nextInt(); // 3

        int[][] placed = new int[10][10];

        for (int i = 1; i <= m; i++) {
            int r  = sc.nextInt();
            int c = sc.nextInt();
            placed[r][c] = i;

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(placed[i][j] + " ");
            }
            System.out.println();
        }


    }
}