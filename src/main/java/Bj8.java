import java.util.Scanner;

public class Bj8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(b==0) {
            System.out.println("0으로 나눌수 없습니다");
        } else {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);

            sc.close();
        }
    }
}