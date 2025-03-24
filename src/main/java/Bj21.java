import java.util.Scanner;

public class Bj21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 24 || a < 0 || b >= 60 || b <0) {
            System.out.println("시간을 제대로 입력하세요");
            return;
        }

        b -= 45;

        if (b < 0) {
            b += 60;
            a -= 1;
        }
        if (a >= 24) {
            a =23;
        }

        System.out.println(a + "시" + b + "분");
    }
}