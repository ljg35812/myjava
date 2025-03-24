import java.util.Scanner;

public class Bj22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= 24 || a <0 || b >=60 || b < 0 || c < 0 || c > 1000) {
            System.out.println("정확한 시간을 입력하세요");
        }
        b += c;

        while (b > 59) {
            b -= 60;
            a += 1;
        }

        if (a > 24) {
            a -= 24;
        }
        System.out.println(a + "시" + b + "분");

        sc.close();
    }
}