import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++) {
            int lan = split[i].length();
            int lan2 = split[i+1].length();

            if(lan > lan2){
                System.out.print(split[i]+" "+lan);
            } else if (lan2 > lan) {
                System.out.print(split[i+1]+" "+lan2);
            }else {
                System.out.println("same");
            }
        }



    }
}