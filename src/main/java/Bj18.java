import java.util.Scanner;

public class Bj18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if (a % 4 == 0) {
            System.out.println("1");
        } else if (a % 100 == 0) {
            System.out.println("0");
        } else if (a % 400 == 0) {
            System.out.println("1");
        }

        sc.close();
    }
}