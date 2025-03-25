import java.util.Scanner;

public class Bye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        double c = (double) a / b;

        System.out.println(a + "/" + b + "=" + c);
    }
}