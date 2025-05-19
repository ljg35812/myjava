import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj56 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = Integer.MIN_VALUE;
        double d = 0;
        for (int i = 0; i < a; i++){
            int c = sc.nextInt();
            ls.add(c);
            if (ls.get(i) > b) {
                b = ls.get(i);
            }
        }

        for (int i = 0; i < ls.size(); i++) {
            double m = (double) ls.get(i) / b * 100;
            d += m;
        }
        System.out.println(d / a);
    }
}