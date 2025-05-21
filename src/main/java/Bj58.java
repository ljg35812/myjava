import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bj58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            String b = sc.nextLine();
            ls.add(b);
            char c = b.charAt(0);
            char d = b.charAt(b.length() - 1);
            ls.set(i, "" + c + d);
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }

        sc.close();
    }
}
