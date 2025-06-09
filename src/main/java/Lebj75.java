import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            String b = sc.next();
            String c = b.charAt(0) + "" + b.charAt(b.length() - 1);
            ls.add(c);
        }

        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }

        sc.close();
    }
}
