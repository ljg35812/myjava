import java.util.Scanner;

public class Lebj72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean d = true;

        for (int i = 0; i < a.length() / 2; i++) {
            int b = a.charAt(i);
            int c = a.charAt(a.length() - i - 1);

            if (b != c) {
                d = false;
                break;
            }
        }
        System.out.println(d ? "1" : "0");

        sc.close();
    }
}
