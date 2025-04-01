import java.util.Scanner;

public class Lebj21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 10000 || a <-10000) {
            System.out.print("장난치지마");
            return;
        }
        int b = sc.nextInt();
        if (b > 10000 || b <-10000) {
            System.out.println("장난치지마");
        }

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("0");
        }

    }
}