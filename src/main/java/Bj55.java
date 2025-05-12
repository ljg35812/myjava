import java.util.Scanner;

public class Bj55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int[a];
        int d = Integer.MIN_VALUE;
        int e = 0;

        for (int i = 0; i < a; i++) {
            int c = sc.nextInt();
            b[i] = c;

            if (b[i] > d) {
                d = b[i];
            }
        }

        for (int i = 0; i < a; i++) {
            b[i] = b[i] / d * 100;
            e += b[i];
        }
        e = e / a;

        for (int i = 0; i < a; i++) {
            System.out.println(e);
        }

        sc.close();
    }
}