import java.util.Scanner;

public class Bj80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        for (int i = 0; i < a.length(); i++) {
            if (i == b - 1) {
                System.out.println(a.charAt(i));
            }
        }

        sc.close();
    }
}
