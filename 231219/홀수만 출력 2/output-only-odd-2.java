import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = n; i >= m; i--){
            if(i % 2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}