import java.util.Scanner;

public class Bj47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[30];
        int []b = new int[2];
        int c;
        int d = Integer.MAX_VALUE;
        int f = Integer.MAX_VALUE;
        boolean []e = new boolean[a.length];

        for (int i = 0; i < 28; i++) {
            c = sc.nextInt();
            a[i] = c;
        }

        for (int j : a) {
            e[j - 1] = true;
        }

        for (int i = 0; i < a.length; i++) {
            if (!e[i]) {
                 b[i] = a[i];
            }
        }
        if (b[2] < d) {
            d = b[2];
        }
        if (b[2] > f) {
            f = b[2];
        }
        System.out.println(d);
        System.out.println(f);
        sc.close();
    }
}