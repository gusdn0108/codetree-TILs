import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] countArr = new int[5];
        int typeNum = 0;
        char s;
        int t;

    
        for(int i = 0; i < 3; i++) {
            s = sc.next().charAt(0);
            t = sc.nextInt();

            if(t >= 37 && s == 'Y')
                typeNum = 1;
            else if(t >= 37)
                typeNum = 2;
            else if(s == 'Y')
                typeNum = 3;
            else
                typeNum = 4;
            countArr[typeNum]++;
        }
        for(int i = 1; i <= 4; i++) {
            System.out.print(countArr[i] + " ");
        }
        
        if(countArr[1] >= 2)
            System.out.print("E");
    }
}