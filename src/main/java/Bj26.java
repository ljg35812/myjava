import java.util.Scanner;

public class Bj26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalPrice = sc.nextInt();

        int sum = 0;


        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum += price * quantity;
        }

        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
