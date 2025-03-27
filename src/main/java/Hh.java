import java.util.Scanner;

public class Hh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("값 정수a를 입력해 주세요: ");
        String a = sc.nextLine();
        if (!a.matches("-?\\d+")) {
            System.out.println("정수만 입력해주세요!");
            return;
        }
        System.out.print("값 정수b를 입력해 주세요: ");
        String b = sc.nextLine();
        if (!b.matches("-?\\d+")) {
            System.out.println("정수만 입력해주세요!");
            return;
        }

        System.out.println("곱하기(1번), 나누기(2번), 더하기(3번), 빼기(4번) 기호중 원하시는 셈의 번호를 적어주세요");
        int c = sc.nextInt();

        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        if (c > 4 || c < 1) {
            System.out.println("제시된 번호만 입력해주세요");
            return;
        } else if (c == 1) {
            int d = aInt * bInt;
            System.out.println(a + " x " + b + " = " + d);
            System.out.println(d + "입니다");
        } else if (c == 2) {
            double e = (double) aInt / bInt;
            System.out.printf("%d / %d = %.2f\n", aInt, bInt, e);
            System.out.printf("%.2f 입니다\n", e);
        } else if (c == 3) {
            int f = aInt + bInt;
            System.out.println(a + " + " + b + " = " + f);
        } else {
            int g = aInt - bInt;
                System.out.println(a + " - " + b + " = " + (aInt - bInt));

        }
        sc.close();
    }
}