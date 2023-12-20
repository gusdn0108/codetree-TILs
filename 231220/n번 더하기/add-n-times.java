import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        while(i < n ){
            a+=n;
            System.out.println(a);
            i++;
        }
    }
}