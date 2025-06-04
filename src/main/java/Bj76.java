import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bj76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>();
        int a = Integer.MIN_VALUE;
        int b = 0;
        int c = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = sc.nextInt();
                if (n > a) {
                    a = n;
                    b = i;
                    c = j;
                }
            }
        }
        System.out.println(a);
        System.out.println((b + 1) + " " + (c + 1));

        sc.close();
    }
}
