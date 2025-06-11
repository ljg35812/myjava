import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        int q = 25;
        int m = 10;
        int n = 5;
        int p = 1;
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = b / q;
            int c1 = b % q;
            int d = c1 / m;
            int d1 = c1 % m;
            int e = d1 / n;
            int e1 = d1 % n;
            int f = e1 / p;
            ls.add(c + " " + d + " " + e + " " + f);
        }

        for (String l : ls) {
            System.out.println(l);
        }

        sc.close();
    }
}
