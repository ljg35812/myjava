import java.util.Scanner;

public class Bye8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String c = (a + b).replaceAll("\\s","").toLowerCase();

        System.out.println(c);
    }
}