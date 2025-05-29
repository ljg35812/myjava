import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lebj67 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<Character, Integer> m = new HashMap<>();
            String a = sc.nextLine().toUpperCase(); // 소문자 입력 대비

            // 다이얼 알파벳 할당
            m.put('A', 3); m.put('B', 3); m.put('C', 3);
            m.put('D', 4); m.put('E', 4); m.put('F', 4);
            m.put('G', 5); m.put('H', 5); m.put('I', 5);
            m.put('J', 6); m.put('K', 6); m.put('L', 6);
            m.put('M', 7); m.put('N', 7); m.put('O', 7);
            m.put('P', 8); m.put('Q', 8); m.put('R', 8); m.put('S', 8);
            m.put('T', 9); m.put('U', 9); m.put('V', 9);
            m.put('W', 10); m.put('X', 10); m.put('Y', 10); m.put('Z', 10);

            int c = 0;
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                if (m.containsKey(ch)) {
                    c += m.get(ch);
                }
            }

            System.out.println(c);
            sc.close();
        }
    }


