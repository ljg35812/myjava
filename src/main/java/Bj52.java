import java.util.Scanner;

public class Bj52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int c = sc.nextInt();

        for (int i = 0; i < a; i++) {
            b[i] = i + 1;
        }

        for (int i = 0; i < c; i++) {
            int d = sc.nextInt();
            int e = sc.nextInt();

            int start = d - 1;
            int end = e - 1;
            while (start < end) {
                int temp = b[start];
                b[start] = b[end];
                b[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}