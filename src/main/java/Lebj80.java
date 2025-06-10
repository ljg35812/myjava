import java.util.Scanner;

public class Lebj80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        int b = 0;

        if (a.isBlank()) {
            System.out.println(0);
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    b++;
                }
            }
            b++;
            System.out.println(b);
        }

        sc.close();
    }
}
