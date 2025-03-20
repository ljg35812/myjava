import java.util.Scanner;

public class Bj20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println(a + b + c);
        } catch (Exception e) {
            System.out.println("입력 오류: 정수를 입력하세요");
        } finally {
            sc.close();
        }

    }
}