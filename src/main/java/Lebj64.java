import java.util.Scanner;

public class Lebj64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String c = sc.next();
            for (int j = 0; j < c.length(); j++) {
                int d = c.charAt(j);
                for (int k = 0; k < b; k++) {
                    System.out.print((char) d);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
