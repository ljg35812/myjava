import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String a = sc.nextLine().replace(" ", "").trim();
            ls.add(a);
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < ls.size(); j++) {
                if (ls.get(j).length() > i) {
                    char b = ls.get(j).charAt(i);
                    System.out.print(b);
                }
            }
        }
        System.out.println();

        sc.close();
    }
}
