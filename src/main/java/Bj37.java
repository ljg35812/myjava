import java.util.Scanner;

public class Bj37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b, c;

        for (int i =1; i <= a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, b, c, b + c);
        }
        sc.close();
    }
}