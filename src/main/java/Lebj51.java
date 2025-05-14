import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj51 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = Integer.MAX_VALUE;
        int c = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            ls.add(sc.nextInt());

            if (ls.get(i) < b) {
                b = ls.get(i);
            }

            if (ls.get(i) > c) {
                c = ls.get(i);
            }
        }
        System.out.println(b + " " + c);
    }
}