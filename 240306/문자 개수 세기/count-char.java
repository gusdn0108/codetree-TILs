import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e'){
                count++;
            }
        }

        System.out.println(count);

    }
}