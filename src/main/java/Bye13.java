import java.util.Scanner;

public class Bye13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aInt, c, d;
        String b = "";
        String e;
        // ("*") * (aInt - 1);

        System.out.print("최대 별의 개수를 입력 ==> ");
        String a = sc.nextLine();

        if (!a.matches("-?\\d+")) {
            System.out.println("저희는 정수만 가능해요");
        } else {
            aInt = Integer.parseInt(a);
            for (int i = 0; i < aInt; i++) {
                b += "*";
                System.out.println(b);
            }
            e = b;
            for (d = aInt - 1; d >= 0; d--) {
                e = e.substring(0, e.length() -1);
                System.out.println(e);
            }

        }
        sc.close();
    }
}
