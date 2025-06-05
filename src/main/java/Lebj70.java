import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        String a = sc.nextLine();
        ls.add("c=");
        ls.add("c-");
        ls.add("dz=");
        ls.add("d-");
        ls.add("lj");
        ls.add("nj");
        ls.add("s=");
        ls.add("z=");

        for (int i = 0; i < a.length(); i++) {
            String b = ls.get(i);
            String c = a.replace(b, "d");
            a = c;
        }

        System.out.println(a);

        sc.close();
    }
}
