import java.util.Scanner;

public class Book8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("파운드를 입력하세요: ");
        double a = sc.nextDouble();
        double c = a * 0.453592;
        System.out.printf("%f 파운드는 %.2킬로그람 입니다", a, c);
        System.out.print("킬로그람을 입력하세요: ");
        double b = sc.nextDouble();
        double d = b * 2.204623;
        System.out.printf("%f 킬로그람은 %.2 파운드 입니다", b, d);

    }
}