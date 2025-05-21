import java.util.Scanner;

public class Bj56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        char c = a.charAt(b);
        System.out.println(c);

        sc.close();
    }
}