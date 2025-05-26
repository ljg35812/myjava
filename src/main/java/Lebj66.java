import java.util.Scanner;

public class Lebj66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // 앞뒤 공백 제거

        int count = 0;

        if (!s.isEmpty()) {
            count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
