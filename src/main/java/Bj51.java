import java.util.*;

public class Bj51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        int []a = new int[10];

        for (int i = 0; i < 10; i++) {
            int b = sc.nextInt();
            int c = b % 42;
            s.add(c);

        }
        System.out.println(s.size());

        sc.close();
    }
}