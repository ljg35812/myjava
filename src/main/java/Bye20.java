import java.util.Scanner;

public class Bye20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 (0입력시 종료):");

            int a = sc.nextInt();

            if (a == 0) {
                System.out.println("0을 입력해서 whil문 종료");
                break;
            }
            System.out.println(a + "입력하셨습니다. whil문 계속");
        }
    }
}