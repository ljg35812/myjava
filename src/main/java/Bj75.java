import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<String>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        List<String> e = new ArrayList<>();

        String f = sc.next();
        String g = sc.next();
        String h = sc.next();
        String i = sc.next();
        String j = sc.next();

        for (int x = 0; x < f.length(); x++) {
            a.add(f.charAt(x) + "");
        }

        for (int x = 0; x < g.length(); x++) {
            b.add(g.charAt(x) + "");
        }

        for (int x = 0; x < h.length(); x++) {
            c.add(h.charAt(x) + "");
        }

        for (int x = 0; x < i.length(); x++) {
            d.add(i.charAt(x) + "");
        }

        for (int x = 0; x < j.length(); x++) {
            e.add(j.charAt(x) + "");
        }

        for (int y = 0; y < 15; y++) {
            for (int z = 0; z < 5; z++) {
                System.out.print(a.get(y));
                System.out.print(b.get(y));
                System.out.print(c.get(y));
                System.out.print(d.get(y));
                System.out.print(e.get(y));
            }
        }
    }
}
