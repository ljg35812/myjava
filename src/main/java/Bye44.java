import java.util.Scanner;

public class Bye44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문장 입력");
        String s = sc.nextLine();

        System.out.println("찾을 문자열 입력");
        String a = sc.nextLine();

        int b = s.indexOf(a);
        int c = s.indexOf(" ", b);
        String d = s.substring(b, c);

        System.out.println("찾은 문자");
        System.out.println(d);

        sc.close();
    }
}