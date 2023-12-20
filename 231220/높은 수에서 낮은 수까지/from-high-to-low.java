import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 22, 31
        if(b >= a){
            for (int i = b; i >= a; i--) {
                System.out.print(i+" ");
            }
        }else {
            for (int i = a; i >= b; i--) {
                System.out.print(i+" ");
            }
        }


    }
}