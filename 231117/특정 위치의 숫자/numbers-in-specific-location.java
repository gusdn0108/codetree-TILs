import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            int tmp = sc.nextInt();
            if(i == 3 || i == 5 || i == 10){
                a += tmp;
            }
        }
        System.out.println(a);

    }
}