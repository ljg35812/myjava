import java.util.Scanner;

public class Bj43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int[a];
        int c, d;
        int e = 0;
        d = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            c = sc.nextInt();
            b[i] = c;
        }
        for (int i = 0; i < a; i++) {
            if (b[i] > d) {
                d = b[i];
                e = i + 1;
            }
            System.out.println(d);
            System.out.println(e);
        }
    }
}