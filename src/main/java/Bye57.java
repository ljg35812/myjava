import java.util.Scanner;

public class Bye57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};
        int big = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > big) {
                big = nums[i];
            }
        }
        System.out.println(big);
    }
}
