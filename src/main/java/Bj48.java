import java.util.Scanner;

public class Bj48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        m += a;
        if (m > 59) {
            h += m / 60;
            m %= 60;
        }

        if (h > 23) {
            d += h / 24;
            h %= 24;
        }
        System.out.println(d + "d : " + h + "h : " + m + "m");
    }
}