import java.util.Scanner;

public class Lebj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 10000) {
            System.out.println("다른 수를 입력해 주세요");
        }else {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        System.out.println(a);
        }
        sc.close();
    }
}