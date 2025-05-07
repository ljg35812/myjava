import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lebj42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int []a = new int[10];

        for (int i = 0; i < 10; i++) {
            int b = sc.nextInt();
            a[i] = b % 42;
            set.add(a[i]);
        }

        System.out.println(set.size());
    }
}