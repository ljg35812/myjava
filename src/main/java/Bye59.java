import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bye59 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Collections.addAll(ls, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 7, 3);
        int a = Integer.MIN_VALUE;

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) > a) {
                a = ls.get(i);
            }
        }

        System.out.println(a);
    }
}