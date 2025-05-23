import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Bj63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();

        String a = sc.nextLine();

        for (int i = 97; i <= 122; i++) {
            char b = (char) i;
            m.put(b, -1);
        }

        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (m.containsKey(a.charAt(j))) {
                    m.put(a.charAt(j), a.indexOf(a.charAt(j)));
                }

            }
        }

        for (Map.Entry<Character, Integer> c : m.entrySet()){
            System.out.print(c.getValue() + " ");
        }

        sc.close();
    }
}