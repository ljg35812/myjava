import java.util.Scanner;

public class Bj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print((a+b)%c);
        System.out.print(((a%c)+(b%c))%c);
        System.out.print((a*b)%c);
        System.out.print(((a%c)*(b%c))%c);
    }
}