import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String chr = sc.next();

        int location = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.chartAt(i) == chr){
                location = i;
            }else{
                System.out.print("No");
            }
        }

    }
}