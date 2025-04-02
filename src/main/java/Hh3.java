import java.util.Scanner;

public class Hh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        int c;

        try {
            System.out.print("값 a를 입력해주세요: ");
            a = sc.nextLine();
            System.out.print("값 b를 입력해주세요: ");
            b = sc.nextLine();

            // 정수 또는 소수만 허용
            if (!a.matches("^-?\\d+(\\.\\d{1,5})?$") || !b.matches("^-?\\d+(\\.\\d{1,5})?$")) {
                System.out.println("소수점 5자리까지만 입력 가능합니다.");
                return;
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println("곱하기(1번), 나누기(2번), 더하기(3번), 빼기(4번) 중 선택하세요:");

        try {
            c = sc.nextInt();
            if (c > 4 || c < 1) {
                System.out.println("잘못된 연산 선택!");
                return;
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
            return;
        }

        // ✅ 정수든 실수든 double로 처리
        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);

        // 연산 수행
        switch (c) {
            case 1 -> System.out.printf("%.5f x %.5f = %.5f\n", num1, num2, num1 * num2);
            case 2 -> System.out.printf("%.5f / %.5f = %.5f\n", num1, num2, num1 / num2);
            case 3 -> System.out.printf("%.5f + %.5f = %.5f\n", num1, num2, num1 + num2);
            case 4 -> System.out.printf("%.5f - %.5f = %.5f\n", num1, num2, num1 - num2);
        }

        sc.close();
    }
}
