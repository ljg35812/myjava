import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lebj65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> m = new HashMap<>();
        String a = sc.nextLine();

        for (int i = 97; i <= 122; i++){
            m.put((char) i,  -1);
        }

        for (int i = 0; i < a.length(); i++) {
            if (m.containsKey(a.charAt(i))) {
                m.put(a.charAt(i), a.indexOf(a.charAt(i)));
            }
        }

        for (Map.Entry<Character, Integer> d : m.entrySet()) {
            System.out.print(d.getValue() + " ");
        }
        System.out.println();

        sc.close();
    }
}
