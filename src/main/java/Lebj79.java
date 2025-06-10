import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        String a = sc.nextLine();
        for (int i = 0; i < a.split(" ").length; i++) {
            ls.add(a.split(" ")[i]);
        }
        System.out.println(ls.size());
    }
}
