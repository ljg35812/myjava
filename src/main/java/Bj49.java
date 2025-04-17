import java.util.Scanner;

public class Bj49 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b;

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}