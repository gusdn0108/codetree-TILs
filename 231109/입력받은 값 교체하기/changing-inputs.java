import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = b;
        int temp2 = a;


        a= temp;
        b = temp2;
        System.out.println(a+" "+b);
    }
}