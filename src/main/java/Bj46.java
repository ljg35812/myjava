import java.util.Scanner;

public class Bj46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] d = new int[n];
        int b, c;

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            d[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            b = sc.nextInt();
            c = sc.nextInt();

            a[b - 1] = d[c - 1];
            a[c - 1] = d[b - 1];
            d[b - 1 ] = a[b - 1];
            d[c - 1] = a[c - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}