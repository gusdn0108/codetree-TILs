import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        while(n <= m){
            if(n % 2 == 0){
                System.out.print(n + " ");
                n+=2;
            }
        }
    }
}