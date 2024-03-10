import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isExisted = false;
        boolean isExisted1 = false;
        String strExisted = "ee";
        String strExisted1 = "ab";

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == strExisted.charAt(i)){
                isExisted = true;
            }
            if(str.charAt(i) == strExisted1.charAt(i)){
                isExisted1 = true;
            }

        }

        if(isExisted == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(isExisted1 == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}