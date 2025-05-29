import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bj64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();
        String a = sc.nextLine();
        int b = 64;
        int c = 0;

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 9) {
                    m.put((char) (j + b), i + 1);
                    m.put((char) 90, i + 1);
                }
                m.put((char) (j + b), i + 1);
            }
            b +=3;
        }

        for (int i = 0; i < a.length(); i++) {
           if (m.containsKey(a.charAt(i))) {
               c += m.get(a.charAt(i));
           }
        }

        System.out.println(c);

        sc.close();
    }
}
