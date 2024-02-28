import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        n = sc.nextInt();
        int[][] arr = new int[n][n];

        int count = 1;

        if (n%2 == 0){
            for(int c=n-1; c>=0; c--){
            if (c%2 == 1){
                for(int r=n-1; r>=0; r--){
                    arr[r][c] = count;
                    count++;
                }
            }
            else if (c%2 == 0){
                for(int r=0; r<n; r++){
                    arr[r][c] = count;
                    count++;
                }
            }
        }
        }

        if (n%2 == 1){
            for(int c=n-1; c>=0; c--){
            if (c%2 == 0){
                for(int r=n-1; r>=0; r--){
                    arr[r][c] = count;
                    count++;
                }
            }
            else if (c%2 == 1){
                for(int r=0; r<n; r++){
                    arr[r][c] = count;
                    count++;
                }
            }
        }
        }
    
        for(int i=0; i<n; i++) {
	        for(int j=0; j<n; j++) {
		        System.out.print(arr[i][j] +" "); 
	        }
            System.out.println();
        }
    }
}