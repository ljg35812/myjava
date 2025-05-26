import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        String x = "";

        for (int i = 0; i < 2; i++) {
            ls.add(sc.next());

            char e = ls.get(i).charAt(1);
            char c = ls.get(i).charAt(0);
            char d = ls.get(i).charAt(2);
            char a = d;
            d = c;
            x = "" + a + e + d;
            ls.set(i, x);
        }

        int f = Integer.parseInt(ls.get(0));
        int g = Integer.parseInt(ls.get(1));

        if (f > g) {
            System.out.println(f);
        } else {
            System.out.println(g);
        }

        sc.close();
    }
}
