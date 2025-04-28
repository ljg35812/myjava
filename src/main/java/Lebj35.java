import java.util.Scanner;

public class Lebj35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int j;

        for (int i = 0; i < n; i++) {
            j = sc.nextInt();
            a[i] = j;
        }

        int v = sc.nextInt();
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == v) {
                k ++;
            }
        }
        System.out.println(k);

        sc.close();
    }
}