import java.util.Scanner;

public class Lebj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

            x = sc.nextInt();
            y = sc.nextInt();

        if (x > 1000 || x < -1000 || y > 1000 || y < -1000) {
            System.out.println("값이 너무 큽니다");
            return;
        }

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }

        sc.close();
    }
}