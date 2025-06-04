import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lebj68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Map<Integer, Integer>> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        int a= Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                m1.put(sc.nextInt(), Map.of(i, j));
            }
        }
        for (Integer b : m1.keySet()) {
            if (b > a) {
                a = b;
            }
        }

        for (Map.Entry<Integer, Map<Integer, Integer>> c : m1.entrySet()) {
            if (c.getKey() == a) {
                System.out.println(c.getKey());
                System.out.println(c.getValue().keySet() + " " + c.getValue().values());
            }
        }
    }
}
