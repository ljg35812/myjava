import java.util.Scanner;

public class Bj70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean b = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                b = false;
                break;
            }
        }
        System.out.println(b ? "1" : "0");

        sc.close();
    }
}
