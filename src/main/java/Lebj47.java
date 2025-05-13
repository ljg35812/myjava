import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<Integer>();
        int a = sc.nextInt();
        int b = Integer.MIN_VALUE;
        int c = 0;

        for (int i = 0; i < a; i++) {
            ls.add(sc.nextInt());
            if (ls.get(i) > b) {
                b = ls.get(i);
                c = i + 1;
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}
