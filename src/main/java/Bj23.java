import java.util.Scanner;

public class Bj23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > 6 || a < 1 || b > 6 || b < 1 || c > 6 || c < 1) {
            System.out.println("제대로된 주사위 값을 입력하세요!");
            sc.close();
            return;
        }

        int prize;

        if (a == b && b == c) {
            prize  = 10000 + a * 1000;
        } else if (a == b || a == c || b == c) {
            int same = (a == b) ? a : (a == c) ? a : b;
            prize = 1000 + same * 100;
        } else {
            prize = Math.max(a,Math.max(b,c)) * 100;
        }
        System.out.println(prize);
        sc.close();
    }
}