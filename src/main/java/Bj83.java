import java.util.Scanner;

public class Bj83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        double g = Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
        double h = Math.sqrt(Math.pow(e - a, 2) + Math.pow(f - b, 2));
        double i = Math.sqrt(Math.pow(e - c, 2) + Math.pow(f - d, 2));

        if (g == h) {

        }
    }
}
