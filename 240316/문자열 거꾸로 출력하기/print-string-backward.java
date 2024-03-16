import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            
            if(Objects.equals(str, "END")){
                break;
            }

            for (int j = str.length()-1; j >= 0 ; j--) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }
}