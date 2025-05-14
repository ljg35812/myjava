import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj53 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ls.add(0);
        }

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = a; j <= b; j++) {
                ls.set(j - 1, c);
            }
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}