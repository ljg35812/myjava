import java.util.Scanner;

public class Lebook8 {
    static int a(int a1, int a2) {
        int b = a1 + a2;
        return b;
    }

    static int b(int b1, int b2) {
        int c = a(b1 + 4, b2 - 2);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int e = a(n, m);
        int f = b(n, m);
        System.out.println(e + " " + f);
    }
}
