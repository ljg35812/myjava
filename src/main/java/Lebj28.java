import java.util.Scanner;

public class Lebj28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;

        for (int i = 1; i <= 9; ++i) {
            b = a * i;
            System.out.println(a + " * " + i + " = " + b);
        }
        sc.close();
    }
}