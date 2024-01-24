import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열을 구현합니다.
        char[][] arr2d = new char[5][3];
        
        // 각 줄마다 알파벳 소문자를 입력받습니다.
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 3; j++)
                arr2d[i][j] = sc.next().charAt(0);

        // 알파벳 소문자를 대문자로 바꾸어 출력합니다.
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                arr2d[i][j] += 'A' - 'a';
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}