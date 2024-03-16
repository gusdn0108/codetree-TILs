import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력받습니다.
        String inputStr = sc.next();
        int qNum = sc.nextInt();

        int strSize = inputStr.length();

        int qType;
        for(int i = 0; i < qNum; i++) {
            qType = sc.nextInt();
            if(qType == 1) {
                // 문자열을 왼쪽으로 한 칸 쉬프트하고 문자열을 출력합니다.
                inputStr = inputStr.substring(1) + inputStr.substring(0, 1);
                System.out.println(inputStr);
            }
            else if(qType == 2) {
                // 문자열을 오른쪽으로 한 칸 쉬프트하고 문자열을 출력합니다.
                inputStr = inputStr.substring(strSize - 1) + inputStr.substring(0, strSize - 1);
                System.out.println(inputStr);
            }
            else if(qType == 3) {
                // 문자열을 좌우로 뒤집고 문자열을 출력합니다.
                StringBuffer sb = new StringBuffer(inputStr);
                inputStr = sb.reverse().toString();
                System.out.println(inputStr);
            }
        }
    }
}