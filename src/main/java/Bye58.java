import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bye58 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            ls.add(sc.nextInt());
        }
        int b = Integer.MIN_VALUE;

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) > b) {
                b = ls.get(i);
            }
        }
        System.out.println(b);

        sc.close();
    }
}