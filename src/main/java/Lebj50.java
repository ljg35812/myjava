import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        int a = sc.nextInt();
        int d = 0;

        for (int i = 0; i < a; i++) {
            ls.add(sc.nextInt());
        }

        int c = sc.nextInt();

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) == c) {
                d ++;
            }
        }
        System.out.println(d);
    }
}