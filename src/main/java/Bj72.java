import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj72 {
    public static void main(String[] args) {
        Set<Character> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int e = 0;

        for (int i = 0; i < a; i++) {
            String b = sc.next();
            for (int j = 0; j < b.length() - 1; j++) {
                if (b.charAt(j) != b.charAt(j + 1)) {
                    char c = b.charAt(j);
                    boolean d = s.add(c);
                    if (!d) {
                        e++;
                        break;
                    }
                }
            }
            s.clear();
        }
        System.out.println(e);

        sc.close();
    }
}
