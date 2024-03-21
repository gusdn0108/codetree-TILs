import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void swap(int n, int m) {
        System.out.println(m+" "+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),m= sc.nextInt();
        swap(n, m);
    }

}