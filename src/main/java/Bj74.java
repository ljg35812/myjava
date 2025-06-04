import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a * b; i++) {
            ls.add(sc.nextInt());
        }

        for (int i = 0; i < ls.size(); i++) {
            list.add(sc.nextInt());
            ls.set(i, ls.get(i) + list.get(i));
        }

        int c = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ls.get(c) + " ");
                c ++;
            }

            if (c == ls.size()) {
                break;
            }
            System.out.println();
        }

        sc.close();
    }
}
