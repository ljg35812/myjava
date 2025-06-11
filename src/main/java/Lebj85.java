import java.util.Scanner;

public class Lebj85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 0; j < i; j++)
                System.out.print("*");
        }

        sc.close();
    }
}
