import java.util.Scanner;

public class Bj12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int once = (b % 10);
        int ten = ((b / 10) % 10);
        int hundred = (b / 100);

        int step1 = a * once;
        int step2 = a * ten;
        int step3 = a * hundred;
        int result = a * b;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(result);
    }
}