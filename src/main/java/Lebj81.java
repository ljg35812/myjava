import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj81 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            ls.add(sc.next());
            char a = ls.get(i).charAt(2);
            char b = ls.get(i).charAt(0);
            char c = ls.get(i).charAt(1);
            String d = (a + "") + (c + "") + (b +"");
            ls.set(i, d);
        }

        int e = Integer.parseInt(ls.get(0));
        int f = Integer.parseInt(ls.get(1));

        if (e > f) {
            f = e;
        }
        System.out.println(f);

        sc.close();
    }
}
