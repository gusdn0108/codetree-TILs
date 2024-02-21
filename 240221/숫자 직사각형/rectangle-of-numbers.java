package org.example;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        int[][] arr2d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j]  = num;
                num += 1;
            }
        }
    }
}