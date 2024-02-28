import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr2d = new int[n][n];

        int count = 1;

        for (int col = n-1; col >= 0 ; col--) {
            if((n-1-col)% 2 ==0){
                for (int row = n-1; row >= 0 ; row--) {
                    arr2d[row][col] = count;
                    count++;
                }
            }else {
                for (int row = 0; row < n; row++) {
                    arr2d[row][col] = count;
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }


    }
}