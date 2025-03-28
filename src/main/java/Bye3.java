import java.util.Scanner;

public class Bye3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("정수b를 입력하세요: ");
        int b = sc.nextInt();

        double c = (double) a / b;

        System.out.printf("%d / %d = %.2f", a, b, c);

    }
}