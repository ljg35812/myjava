import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bj53 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int []a = new int[28];

        for (int i = 0; i < 28; i++) {
            int c = sc.nextInt();
            a[i] = c;
            set.add(a[i]);
        }
        for (int i = 1; i <= 30; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }

    }
}