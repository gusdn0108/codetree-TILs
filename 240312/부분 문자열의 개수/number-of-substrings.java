import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // ba na / na
        String verification = sc.next();
        // na

        // 문자열.substring(시작 인덱스, 끝 인덱스)

        int cnt = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals(verification)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}