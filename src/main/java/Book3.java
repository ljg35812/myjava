import java.util.Scanner;

public class Book3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("파운드를 입력하세요 :");
        a = sc.nextDouble();
        if (a < 0) {
            System.out.println("장난치지마세요");
            return;
        } else {
            System.out.printf("%.0f 파운드는 %.2f 킬로그람 입니다\n", a, a * 0.453592);
        }

        System.out.print("킬로그램을 입력하세요 : ");
        b = sc.nextDouble();
        if (b < 0) {
            System.out.println("장난치지마세요");
            return;
        } else {
            System.out.printf("%.0f 파운드는 %.2f 킬로그램 입sl다\n", b, b * 2.204623);
        }

        sc.close();

    }
}