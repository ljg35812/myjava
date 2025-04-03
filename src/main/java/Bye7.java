import java.util.Scanner;

public class Bye7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String c = (a.trim() + b.trim()).toLowerCase();
        System.out.println(c);
        sc.close();
    }
}