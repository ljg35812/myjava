import java.util.Scanner;

public class Lebj29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

   m += t;

        if (m > 60) {
            h = h + m / 60;
            m = m % 60;
        }
        if (h >= 24) {
            h = h % 24;
        }
        System.out.println(h + " : " + m);
        sc.close();
    }
}