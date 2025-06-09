import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        int a = Integer.MIN_VALUE;
        int c = 0;

        for (int i = 0; i < 9; i++) {
            int b = sc.nextInt();
            ls.add(b);

            if (b > a) {
                a = b;
                c = ls.get(i);
            }
        }

        System.out.println(a);
        System.out.println(c);

        sc.close();
    }
}
