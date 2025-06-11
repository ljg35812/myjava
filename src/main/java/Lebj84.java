import java.util.Scanner;

public class Lebj84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i ++) {
            System.out.print(" ".repeat(a - i));
            System.out.print("*".repeat(i));
            System.out.println();
        }

        sc.close();
    }
}
