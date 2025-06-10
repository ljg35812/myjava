import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lebj82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();
        String s = sc.nextLine();
        s = s.toUpperCase();
        int a = 0;

        for (int i = 65; i <= 67; i++) {
            m.put((char) i, 3);
        }
        for (int i = 68; i <= 70; i ++) {
            m.put((char) i, 4);
        }
        for (int i = 71; i <= 73; i++) {
            m.put((char) i, 5);
        }
        for (int i = 74; i <= 76; i++) {
            m.put((char) i, 6);
        }
        for (int i = 77; i <= 79; i++) {
            m.put((char) i, 7);
        }
        for (int i = 80; i <= 83; i++) {
            m.put((char) i, 8);
        }
        for (int i = 84; i <= 86; i++) {
            m.put((char) i, 9);
        }
        for (int i = 87; i <= 90; i++) {
            m.put((char) i, 10);
        }

        for(Map.Entry<Character, Integer> c : m.entrySet()) {
            for (int i = 0; i < s.length(); i++) {
                if (c.getKey() == s.charAt(i)) {
                    a += c.getValue();
                }
            }
        }
        System.out.println(a);

        sc.close();
    }
}
