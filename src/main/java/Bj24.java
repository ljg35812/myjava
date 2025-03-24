import java.util.Scanner;

public class Bj24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if (a < 1 || a > 9) {
            System.out.println("1~9단 까지만 입력해 주세요");
        } else {
            for (int num = 1; num <= 9; num++) {
                System.out.println(a + "*" + num + "=" + (a * num));
            }
        }

        sc.close();
    }
}