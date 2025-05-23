import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            ls.add(sc.nextInt());
            if (ls.get(i) < b) {
                System.out.println(ls.get(i) + " ");
            }
        }

        sc.close();
    }
}
