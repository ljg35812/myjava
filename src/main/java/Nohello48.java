import java.util.HashMap;
import java.util.Map;

public class Nohello48 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("이름", "이정근");
        map.put("email", "ljg35812@gmail.com");
        map.put("부서", "데이터분석과");

        System.out.println("조회결과");
        System.out.println("이름" + map.get("email"));
        System.out.println("email" + map.get("email"));
        System.out.println("부서" + map.get("email"));

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}