import java.util.Scanner;

public class Bye32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i += 2){
            int b = (a - i) / 2;

            System.out.print(" ".repeat(b));
            System.out.print("*".repeat(i));
            System.out.println(" ".repeat(b));
        }
        sc.close();
    }
}