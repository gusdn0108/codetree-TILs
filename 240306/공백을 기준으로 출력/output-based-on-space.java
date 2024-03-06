import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();

        String[] split = str.split(" ");
        String[] split1 = str1.split(" ");

        int length = split.length;
        int length1 = split1.length;

        String convert = "";
        String convert1 = "";
        for (int i = 0; i < length; i++) {
            convert += split[i];
        }

        for (int i = 0; i <length1 ; i++) {
            convert1 += split1[i];
        }

        System.out.print(convert+convert1);


    }
}