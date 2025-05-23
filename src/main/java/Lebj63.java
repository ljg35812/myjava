import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lebj63 {
    public class Bye70 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Integer> ls = new ArrayList<>();

            System.out.println("저장할 데이터수 입력");
            int a = sc.nextInt();

            for (int i = 0; i < a; i++) {
                ls.add(sc.nextInt());
            }
            for (int b : ls) {
                System.out.print(b + " ");
            }
        }
    }
}
