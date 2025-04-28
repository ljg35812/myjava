import java.util.Scanner;

public class Lebj38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int d = 0;
        int []b = new int[9];

        for (int i = 0; i < 9; i++) {
            a = sc.nextInt();
            b[i] = a;
        }

        int c = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            if (b[i] > c)  {
                c = b[i];
                d = i + 1;
            }
        }
        System.out.println(c);
        System.out.println(d);

        sc.close();
    }
}