import java.util.Scanner;

public class Bye21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "****";
        int c, d;

        for (c = 0; c <= 3; c++) {
            a += "*";
            System.out.println(a);
        }
        if (c == 4) {
            for (d = 2; d >= 0; d--) {
                b = b.substring(0, b.length() -1);
                System.out.println(b);
            }
        }
    }
}