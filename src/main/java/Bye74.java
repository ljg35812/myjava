import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bye74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            ls.add(sc.nextInt());
        }

        for (int i = 0; i < ls.size(); i++) {
            int a = Integer.MAX_VALUE;
            if (ls.get(i) < a) {
                a = ls.get(i);
                System.out.println(a + " ");
                ls.remove(a);
            }
            a = Integer.MAX_VALUE;
        }

        sc.close();
    }
}

