import java.util.Scanner;

public class Lebook9 {
    static int a(int b1, int b2, int b3, int b4) {
        int c = (b1 + b2) + b3 * b4;
        return c;
    }

    static int a(int b1, int b2) {
        return a(b1, b2, 0, 0);
    }

    public static void main(String[] argw) {
        Scanner sc = new Scanner(System.in);
        int a = a(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println();
        int b = a(sc.nextInt(), sc.nextInt());

        System.out.println(a + " " + b);

        sc.close();
    }
}
