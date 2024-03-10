import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isExisted = false;
        String strExisted = "ee";
        String strExisted1 = "ab";

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == strExisted.charAt(i) && str.charAt(i) == strExisted1.charAt(i)){
                isExisted = true;
            }
        }

        if(isExisted == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}