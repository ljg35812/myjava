import java.util.Scanner;

public class Bj39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a != 0 && b != 0) {
                System.out.println(a + " + " + b + " = " + (a + b));
            } else {
                break;
            }
        }
        sc.close();
    }
}