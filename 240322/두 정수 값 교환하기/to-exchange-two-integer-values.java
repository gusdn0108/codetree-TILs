import java.util.Objects;
import java.util.Scanner;


class IntWapper {
    int value;

    public IntWapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void swap(IntWapper n,IntWapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWapper nWrapper = new IntWapper(n);
        IntWapper mWrapper = new IntWapper(m);

        swap(nWrapper,mWrapper);

        n = nWrapper.value;
        m = mWrapper.value;

        System.out.println(n+" "+m);
    }

}