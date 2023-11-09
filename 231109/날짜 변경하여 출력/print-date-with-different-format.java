import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();


        System.out.println(m+"-"+d+"-"+y);

        // java에서 useDelimiter 안에 적어야 하는 내용은 실제 정규 표현식 (Regular expression)이기에, 
        // "." 문자를 문자 그대로 사용하고 싶을시 escape string인 "\"를 붙여주셔야 합니다
    }
}