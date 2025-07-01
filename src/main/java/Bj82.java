import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        ls.add(x);
        ls.add(y);
        ls.add(w - x);
        ls.add(h - y);
        int c = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            if (ls.get(i) < c) {
                c = ls.get(i);
            }
        }

        System.out.println(c);

        sc.close();
    }
}
