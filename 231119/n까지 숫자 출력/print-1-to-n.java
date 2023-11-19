import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1;
        n = sc.nextInt();
        while(i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}