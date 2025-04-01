import java.util.Scanner;

public class Lebj24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d;

        if (a == b && b == c ) {
            d = 10000 + a * 1000;
        } else if (a ==b || b ==c || c == a) {
            int e = (a == b) ? a : (a == c) ? a : b;
            d = 1000 + e * 100;
        } else {
            d = Math.max(c, Math.max(a, b)) * 100;
        }
        System.out.println(d);
        sc.close();
    }
}