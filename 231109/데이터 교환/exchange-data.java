public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int temp = a;
        int temp2 = b;
        int temp3 = c;

        b= temp;
        c = temp2;
        a = temp3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}