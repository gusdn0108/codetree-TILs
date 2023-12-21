import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //22
        int m = sc.nextInt(); // 31
        if(m > n){
            for (int i = m; i >= n; i--) {
                System.out.print(i+" ");
            }
        }

        
    }
}