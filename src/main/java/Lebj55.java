import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lebj55 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 28; i ++) {
            s.add(i);
        }
        for (int i = 0; i < 30; i++) {
            if (!s.contains(i)) {
                System.out.print(i);
            }
        }

        sc.close();
    }
}