import java.util.Scanner;

public class Bj42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int []c = new int[a];

        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }
        int d;

        for (int i = 0; i < a; i++) {
            if (c[i] < b) {
                System.out.println(c[i]);
            }
        }
        sc.close();
    }
}