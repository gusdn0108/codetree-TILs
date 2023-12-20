import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();

        if(Objects.equals(c, "A")){
            for (int i = 1; i <= n; i++) {
                System.out.print(i+ " ");
            }
        }

        if(Objects.equals(c, "D")){
            for (int i = n; i >= 1; i--) {
                System.out.print(i+" ");
            }
        }


    }
}