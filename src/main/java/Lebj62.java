import java.util.ArrayList;
import java.util.List;

public class Lebj62 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("이정근");
        ls.add("유호현");
        ls.add("정주영");
        ls.add("이협건");

        int a = ls.size();
        System.out.println("저장된 데이터 수 : " + a);
        System.out.println(ls);

        System.out.println("2세대 반복문");
        for (String s : ls) {
            System.out.println(s);
        }

        System.out.println("3세대 반복문");
        ls.forEach(l -> System.out.println(l));

        System.out.println("4세대 반복문");
        ls.parallelStream().forEach(n -> System.out.println(n));
    }
}