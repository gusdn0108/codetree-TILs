import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n >= m){
            if(n % 2 == 1 ){
                System.out.print(n+" ");
                n--;
            }
        }
    }
}