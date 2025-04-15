import java.util.Scanner;

public class Bj45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int i, j, k;

        for (int x = 0; x < m; x++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            for (int y = i - 1; y <= j - 1; y++) {
                a[y] = k;
            }
        }

        for (int x = 0; x < n; x++) {
            System.out.print(a[x] + " ");
        }

        sc.close();
    }
}