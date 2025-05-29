import java.util.Scanner;

public class Bj68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a * 2 - 1;

        for (int i = 1; i <= a; i += 2) {
            int b = (a - i) / 2;
            System.out.print(" ".repeat(b));
            System.out.print("*".repeat(i));
            System.out.println(" ".repeat(b));
        }

        for (int i = a - 2; i >= 1; i -= 2) {
            int b = (a - i) / 2;
            System.out.print(" ".repeat(b));
            System.out.print("*".repeat(i));
            System.out.println(" ".repeat(b));
        }

        sc.close();
    }
}
