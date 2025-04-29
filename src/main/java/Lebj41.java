import java.util.Scanner;

public class Lebj41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        for (int i = 1; i <= m; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();

           int e = a[c - 1];
           a[c - 1] = a[d - 1];
           a[d - 1] = e;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
