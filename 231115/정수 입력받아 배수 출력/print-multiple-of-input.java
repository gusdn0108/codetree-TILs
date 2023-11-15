import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number; i * 5; i+=number) {
            System.out.print(i+" ");
        }
    }
}