import java.util.*;

public class Bye68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, String>> ls = new ArrayList<>();
        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) {
            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("이메일: ");
            String mail = sc.nextLine();

            System.out.print("부서: ");
            String dept = sc.nextLine();

            map = new HashMap<>();

            map.put("name", name);
            map.put("mail", mail);
            map.put("dept", dept);

            ls.add(map);

            map = null;
        }
        int lsstsize = ls.size();

        System.out.println(lsstsize);

        for (Map<String, String> m : ls) {
            System.out.println(m.get("name"));
            System.out.println(m.get("mail"));
            System.out.println(m.get("dept"));
            System.out.println("-----------");
        }

        sc.close();
    }
}