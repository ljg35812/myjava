import java.util.Scanner;

public class Lebj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(a);
        System.out.println(b);

        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            System.out.println("값이 너무 큽니다");
            return;
        }
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
        sc.close();
    }
}