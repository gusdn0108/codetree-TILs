import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char find = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == find ) {
                count++;
                System.out.println(arr[i]);
            } else if (arr[i].charAt(3) == find) {
                count++;
                System.out.println(arr[i]);
            }

        }

        System.out.println(count);

    }
}