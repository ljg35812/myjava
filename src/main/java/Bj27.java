import java.util.Scanner;

public class Bj27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 1 || b == 2) {
            System.out.println("NEWBIE");
        } else if (b <=a) {
            System.out.println("OlDBIE");
        } else {
            System.out.println("TlE!");
        }
        sc.close();
    }
}