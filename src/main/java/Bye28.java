import java.util.Scanner;

public class Bye28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("별개수 입력 ==> ");
        a = sc.nextInt();

        if (a % 2 != 1) {
            System.out.println("홀수를 입력하세요.");
        } else {
            for (int i = 1; i <= a; i += 2) {
                b = (a - i) / 2;
                System.out.print(" ".repeat(b));
                System.out.print("*".repeat(i));
                System.out.println(" ".repeat(b));
            }
        }

        sc.close();
    }
}