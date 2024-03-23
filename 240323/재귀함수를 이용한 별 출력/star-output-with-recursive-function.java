import java.util.Scanner;


public class Main {
    public static int n;

    public static void printStar(int n ){
        if(n == 0){
            return;
        }

        printStar(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printStar(n);

    }
}