import java.util.Scanner;

public class Lebj36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int b;

        for (int i = 0; i < n; i++) {
            b = sc.nextInt();
            a[i] = b;
        }

        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}