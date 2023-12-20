import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 20
        int m = sc.nextInt();   // 10

        while (n >= m){
            if(n % 2 == 0 ){
                System.out.print(n+" ");
                n -=2;
            }
        }
    }
}