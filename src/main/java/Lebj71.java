import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lebj71 {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = Integer.MIN_VALUE;
        int g = 0;
        char f = 'a';
        boolean what = true;
        a = a.toUpperCase();

        for (int i = 65; i <= 90; i++) {
            m.put((char) i, 0);
        }

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            if (e.getValue() > b) {
                b = e.getValue();
                f = e.getKey();
            }
        }
        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            if(b == e.getValue()) {
                g++;
                if(g > 1) {
                    what = false;
                    break;
                }
            }
        }

        System.out.println(what ? f : "?");

        sc.close();
    }
}
