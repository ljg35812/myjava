import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bye76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            m.put(i, sc.nextInt());
        }

        for (int i = 0; i < 6; i++) {
            int a = Integer.MAX_VALUE;
            for (int j = 0; j <= m.size(); j++) {
                if (m.get(j) < a) {
                    a = m.get(j);
                    System.out.println(a + " ");
                }
                m.remove(a);
            }
        }

        sc.close();
    }
}
