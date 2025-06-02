import java.util.*;

public class Bj69 {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toUpperCase();
        boolean c = true;
        int d = 0;

        for (int i = 65; i <= 90; i++) {
            m.put((char) i, 0);
        }

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);

            if (m.containsKey(b)) {
                m.put(b, m.get(b) + 1);
            }
        }

        int b = Integer.MIN_VALUE;
        char f = 'k';

        for (Map.Entry<Character, Integer> map : m.entrySet()) {
            if (map.getValue() > b) {
                b = map.getValue();
                f = map.getKey();

            }
        }

        for (Map.Entry<Character, Integer> map : m.entrySet()) {
            if (b == map.getValue()) {
                d ++;
                if (d > 1) {
                    c = false;
                    break;
                }
            }
        }

        System.out.println(c ? f : "?");

        sc.close();
    }
}