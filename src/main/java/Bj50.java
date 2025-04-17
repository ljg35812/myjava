import java.util.Scanner;

public class Bj50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int[a];

        int c = Integer.MAX_VALUE;
        int d = Integer.MIN_VALUE;

        for (int i =1; i <= a; i++) {
            b[i - 1] = sc.nextInt();

            if (b[i - 1] < c) {
                c = b[i - 1];
            }
            if (b[i - 1] > d) {
                d = b[i - 1];
            }
        }
        System.out.println(c + " " + d);

        sc.close();
    }
}