import java.util.Scanner;

public class Bj60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = 0;

        for (int i = 0; i < a; i++) {
            c += b.charAt(i) - '0';
        }
        System.out.println(c);

        sc.close();
    }
}