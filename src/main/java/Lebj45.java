import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj45 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ls.add(sc.nextInt());
            if (ls.get(i) < x) {
                System.out.print(ls.get(i) + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}