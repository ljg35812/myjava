import java.util.Scanner;

public class Bye4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c;

        a = a.toLowerCase();
        b = b.toLowerCase();

        c = (a.trim() + b.trim());

        System.out.println(c);
        sc.close();
    }
}