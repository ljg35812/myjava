import java.util.Scanner;

public class Hh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        int c;

        try {
            System.out.print("값 a를 입력해주새요: ");
            a = sc.nextLine();
            if (!a.matches("-?\\d*\\.\\d{1,5}")) {
                System.out.println("소수점 5의 자리 까지만 입력해주세요");
                return;
            }
            System.out.print("값 b를 입력해주세요: ");
            b = sc.nextLine();
            if (!b.matches("-?\\d*\\.\\d{1,5}")) {
                System.out.println("소수점 5자리 까지만 입력해 주세요");
                return;
            }
        } catch (Exception e) {
            System.out.println("장난치지 마세요");
            return;
        }

        System.out.println("곱하기(1번), 나누기(2번), 빼기(3번), 더하기(4번)중 원하시는 셈의 번호를 눌러주세요");

        try {
            c = sc.nextInt();
            if (c > 4 || c < 1) {
                System.out.println("장난치지마");
                return; }
        } catch (Exception e) {
            System.out.println("숫자기호만 입력해주세요");
            return;
        }

        int aInt = 0;
        int bInt = 0;

        if (a.matches("-?\\d+") && (b.matches("-?\\d+"))) {

            aInt = Integer.parseInt(a);
            bInt = Integer.parseInt(b);

            if (c == 1) {
                int d = aInt * bInt;
                System.out.println(aInt + "x" + bInt + "=" + d);
                System.out.println(d + "입니다");
            } else if (c == 2) {
                double e = (double) aInt / bInt;
                System.out.printf("%d / %d = %.2f", aInt, bInt, e);
                System.out.printf("%.2f 입니다",e);
            } else if (c == 3) {
                int f = aInt + bInt;
                System.out.println(aInt + "+" + bInt + "=" + f);
                System.out.println(f + "입니다");
            } else {
                int g = aInt - bInt;
                System.out.println(aInt + "-" + bInt + "=" + g);
                System.out.println(g + "입니다");
            }

        } else if (a.matches("-?\\d*\\.\\d{1,5}") && (b.matches("-?\\d*\\.\\d{1,5}"))) {

            double aDouble = Double.parseDouble(a);
            double bDouble = Double.parseDouble(b);

            if (c == 1) {
                double d = aDouble * bDouble;
                System.out.println(aDouble + "x" + bDouble + "=" + d);
                System.out.println(d + "입니다");
            } else if (c == 2) {
                double e = aDouble / bDouble;
                System.out.printf("%.5f / %.5f = %.5f\n", aDouble, bDouble, e);
                System.out.printf("%.5f입니다\n", e);
            } else if (c == 3) {
                double f = aDouble + bDouble;
                System.out.println(aDouble + "+" + bDouble + "=" + f);
                System.out.println(f + "입니다");
            } else {
                double g = aDouble - bDouble;
                System.out.println(aDouble + "-" + bDouble + "=" + g);
                System.out.println(g + "입니다");
            }

        } else if (a.matches("-?\\d+") && (b.matches("-?\\d\\.\\d{1,5}"))) {

            aInt = Integer.parseInt(a);
            double bDouble = Double.parseDouble(b);

            if (c == 1) {
                double d = aInt * bDouble;
                System.out.println(aInt + "x" + bDouble + "=" + d);
                System.out.println(d + "입니다");
            }else if (c == 2) {
                double e = aInt / bDouble;
                System.out.println(aInt + "/" + bDouble + "=" + e);
                System.out.println(e + "입니다");
            }else if (c == 3) {
                double f = aInt - bDouble;
                System.out.println(aInt + "+" + bDouble + "=" + f);
                System.out.println(f + "입니다");
            }else {
                double g = aInt - bDouble;
                System.out.println(aInt + "-" + bDouble + "=" + g);
                System.out.println(g + "입니다");
            }

        } else if (a.matches("-?\\d\\.\\d{1,5}") && (b.matches("-?\\d+"))) {

            double aDouble = Double.parseDouble(a);
            bInt = Integer.parseInt(b);

            if (c == 1) {
                double d = aDouble * aInt;
                System.out.println(aDouble + "x" + bInt + "=" + d);
                System.out.println(d + "입니다");
            } else if (c == 2) {
                double e = aDouble / bInt;
                System.out.println(aDouble + "/" + bInt + "=" + e);
                System.out.println(e + "입니다");
            }else if (c == 3) {
                double f = aDouble + bInt;
                System.out.println(aDouble + "+" + bInt + "=" + f);
                System.out.println(f + "입니다");
            } else {
                double g = aDouble - bInt;
                System.out.println(aDouble + "-" + bInt + "=" + g);
                System.out.println(g + "입니다");
            }
        }
        sc.close();
    }
}