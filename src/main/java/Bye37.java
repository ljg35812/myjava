import java.util.Scanner;

public class Bye37 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                c += i;
            }
        }
        System.out.println(c);

        sc.close();
    }
}
