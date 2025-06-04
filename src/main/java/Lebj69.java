import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(2);
        ls.add(8);

        String a = sc.next();
        a = a.replace(" ", "");

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            int c = ls.get(i) - b;
            ls.set(i, c);
        }

        for (Integer i : ls) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}
