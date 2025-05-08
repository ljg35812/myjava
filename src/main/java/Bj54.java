import java.util.Scanner;

public class Bj54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            if ((d - c) % 2 == 1) {
                for (int k = 0; k < ((d - c) / 2) + 1; k++) {
                    int e = a[c + (k - 1)];
                    a[c + (k - 1)] = a[d - (k + 1)];
                    a[d - (k + 1)] = e;
                }
            } else if ((d - c) % 2 == 0) {
                for (int j = 0; j < (d - c) / 2; j++) {
                    int e = a[c + (j - 1)];
                    a[c + (j - 1)] = a[d - (j + 1)];
                    a[d - (j + 1)] = e;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}