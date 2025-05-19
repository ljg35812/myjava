import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj57 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ls.add(i + 1);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((b - a) % 2 == 1) {
                for (int j = 0; j < ((b - a) / 2) + 1; j++) {
                    int e = ls.get(a + (j - 1));
                    ls.set(a + (j - 1), b - (j + 1));
                    ls.set(b - (j + 1), e);
                }
            } else if ((b - a) % 2 == 0) {
                for (int k = 0; k < ((b - a) / 2); k++) {
                    int e = ls.get(a + (k - 1));
                    ls.set(a + (k - 1), b - (k + 1));
                    ls.set(b - (k + 1), e);
                }
            }
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}