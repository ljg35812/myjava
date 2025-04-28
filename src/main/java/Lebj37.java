import java.util.Scanner;

public class Lebj37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }

        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < c) {
                c = a[i];
            }
            if (a[i] > d) {
                d = a[i];
            }
        }
        System.out.println(c + " " + d);

        sc.close();
    }
}
