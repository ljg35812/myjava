import java.util.*;

public class Bye63 {
    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        List<Map<String, String>> ls = new ArrayList<>();
        System.out.println("SQL emp파일의 구현");
        System.out.println();

        Map<String, String> m = null;

        for (int i = 0; i < 2; i++) {
            System.out.print("부서번호: ");
            String deptno = sc.nextLine();

            System.out.print("사원번호: ");
            String empno = sc.nextLine();

            System.out.print("이름 : ");
            String ename = sc.nextLine();

            System.out.print("직업: ");
            String job = sc.nextLine();

            System.out.print("급여: ");
            String sal = sc.nextLine();

            System.out.print("보너스: ");
            String comm = sc.nextLine();
            m = new HashMap<>();

            m.put("부서번호", deptno);
            m.put("사원번호", empno);
            m.put("이름", ename);
            m.put("직업", job);
            m.put("급여", sal);
            m.put("보너스", comm);

            ls.add(m);

            m = null;
        }

        System.out.println(ls.size());

        for (Map<String, String> b : ls) {
            System.out.println(b.get("부서번호"));
            System.out.println(b.get("사원번호"));
            System.out.println(b.get("이름"));
            System.out.println(b.get("직업"));
            System.out.println(b.get("급여"));
            System.out.println(b.get("보너스"));
            System.out.println("-----------");
        }

        sc.close();
    }
}