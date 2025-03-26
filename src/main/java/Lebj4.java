import java.util.Scanner;

public class Lebj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 != 0 || n < 4 || n >1000) {
            System.out.println("바이트는 4의 배수만 됩니다.");
            return;
        } else {
            int a = 0;
            for (int i = 4; i <= n; i += 4) {
                System.out.print("long ");
            }
            System.out.print("int");
        }
        sc.close();
    }
}