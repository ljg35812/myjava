import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(2);
        ls.add(8);


        for (int i = 0; i < ls.size(); i++) {
            int b = sc.nextInt();
            ls.set(i, ls.get(i) - b);
        }

        for  (int i : ls) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
