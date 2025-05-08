import java.util.Scanner;

public class Lebj43 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int e, f;

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            e = b - 1;
            f = c - 1;

            while (e < b) {
                int g = a[e];
                a[e] = a[f];
                a[f] = g;
                b++;
                c--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}