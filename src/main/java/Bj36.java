import java.util.Scanner;

public class Bj36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int a, b;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c += a * b;
        }

        if (x == c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}