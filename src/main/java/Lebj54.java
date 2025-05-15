import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj54{
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ls.add(i + 1);
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = ls.get(a - 1);
            ls.set(a - 1, ls.get(b -1));
            ls.set(b - 1, c);
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}