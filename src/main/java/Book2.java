import java.util.Scanner;

public class Book2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("정수1 ==>");
        a = sc.nextInt();
        System.out.print("정수2 ==>");
        b = sc.nextInt();

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "x" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "%" + b + "=" + (a % b));

    }
}