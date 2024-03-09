import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String covert = "";

        // codetreeisverygood
        // oere
        for (int i = 0; i < a.length() ; i++) {
            if(i % 2 != 0){
                covert += a.charAt(i);
            }
        }

        for (int i = covert.length()-1; i >=0 ; i--) {
            System.out.print(covert.charAt(i));
        }
    }
}