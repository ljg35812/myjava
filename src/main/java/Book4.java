import java.util.Scanner;

public class Book4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("시험점수를 입력하세요");
        a = sc.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("장난치지 마세요");
            return;
        }

        if (a > 70) {
            System.out.println("합격을 축하드립니다");
        } else if (a <70) {
            System.out.println("불합격 입니다 다음에 또 도전해 주세요");
        }

        sc.close();
    }
}