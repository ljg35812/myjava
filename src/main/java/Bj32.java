import java.util.Scanner;

public class Bj32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = "";

        for (int i = 0; i < a; i++) {
            for (int j = i; j < a - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}