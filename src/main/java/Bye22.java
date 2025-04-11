import java.util.Scanner;

public class Bye22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String c = "";
        String e;
        int aInt, b, d;

        System.out.print("최대 별개수 입력: ");
        a = sc.nextLine();

        if (!a.matches("\\d+")) {
            System.out.println("정수만 입력하세요");
        } else {
            aInt = Integer.parseInt(a);
            for (b = 1; b <= aInt; ++b) {
                c += "*";
                System.out.println(c);
            }
            e = c;
            for (d = aInt - 1; d >= 1; --d) {
                e = e.substring(0, e.length() - 1);
                System.out.println(e);
            }
        }
        sc.close();
    }
}
