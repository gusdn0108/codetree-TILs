import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr = sc.next().charAt(0);

        int location = 0;
        boolean isContinue = false;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == chr){
                location = i;
                isContinue = true;
            }
        }

        if(isContinue == true){
            System.out.println(location);
        }else {
            System.out.println("No");
        }

    }
}