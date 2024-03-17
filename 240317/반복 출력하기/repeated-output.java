import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print5Stars(n);


    }

    public static void print5Stars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("12345^&*()_");
        }
        System.out.println();
    }
}