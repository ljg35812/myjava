import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj71 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("dz=");
        ls.add("c=");
        ls.add("c-");
        ls.add("d-");
        ls.add("lj");
        ls.add("nj");
        ls.add("s=");
        ls.add("z=");

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = 0; i < ls.size(); i++) {
            String b = ls.get(i);
            String c = a.replace(b, "*");
            a = c;
        }

        System.out.println(a.length());

        sc.close();
    }
}
