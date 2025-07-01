import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bye75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            s.add(sc.nextInt());
        }

        s.forEach(i -> System.out.print(i + ","));
    }
}
