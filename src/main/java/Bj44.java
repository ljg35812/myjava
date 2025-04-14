import java.util.Scanner;

public class Bj44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int[a];
        int c, d;

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }

        c = Integer.MAX_VALUE;
        d = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            if (b[i] < c) {
                c = b[i];
            }
            if (b[i] > d) {
                d = b[i];
            }
        }
        System.out.println(c + " " + d);

        sc.close();
    }
}