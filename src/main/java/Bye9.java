import java.util.Scanner;

public class Bye9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String c = (a + b).replace(" ","").toLowerCase();
        System.out.println(c);
    }
}