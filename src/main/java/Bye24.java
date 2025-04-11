import java.util.Scanner;

public class Bye24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        String b = "";
        String c;
        int d, e;

        System.out.print("최대 별값 입력: ");
        a = sc.nextLine();

        if (!a.matches("\\d+")) {
            System.out.println("정수만 받음");
        } else {
            int aInt = Integer.parseInt(a);
            for (d = 1; d <= aInt; d++) {
                b += "*";
                System.out.println(b);
            }
            c = b;
            for (e = aInt -1; e >= 1; e--) {
                c = c.substring(0, c.length() -1);
                System.out.println(c);
            }
        }
        sc.close();
    }
}