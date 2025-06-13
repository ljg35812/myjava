import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bye73 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            s.add(a);
        }
        s.forEach(b -> System.out.print(b +" "));
        System.out.println();

        sc.close();
    }
}
