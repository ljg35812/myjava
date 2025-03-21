import java.util.Scanner;

public class Nohello9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;

        double res1;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        res1 = (double) n1 / n2;
        System.out.println(n1 + " + " + n2 + " = " + res1);

        res = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

        res = n1 - n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

        res = n1 * n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

        res = n1 % n2;
        System.out.println(n1 + " + " + n2 + " = " + res);

    }
}
