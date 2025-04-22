import java.util.Scanner;

public class Lebj34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []d = new int [a];
        int b,c;

        for (int i = 1; i <= a; i++) {
            b =sc.nextInt();
            d[i] = b;
        }
        System.out.println(d);
    }
}