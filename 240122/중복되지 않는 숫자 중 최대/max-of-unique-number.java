import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] nums = new int[MAX_N];
        
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        
        int max = -1;
        for(int i = 0; i < n; i++) {
            int currNum = nums[i];
   
            if(max < currNum) {
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[j] == currNum) {
                        count++;
                    }
                }
                if(count == 1) {
                    max = currNum;
                }
            }
        }

        System.out.print(max);
    }
}