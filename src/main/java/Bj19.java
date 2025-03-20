import java.util.Scanner;

public class Bj19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("제1사분면");
        } else if (a < 0 && b > 0) {
            System.out.println("제2사분면");
        } else if (a < 0 && b < 0) {
            System.out.println("제3사분면");
        } else if (a > 0 && b < 0) {
            System.out.println("제4사분면");
        }

        sc.close();
    }
}