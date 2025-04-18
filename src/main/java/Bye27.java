import java.util.Scanner;

public class Bye27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작값 입력 ==> ");
        int a = sc.nextInt();
        System.out.print ("끝값입력 ==> ");
        int b = sc.nextInt();
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0);
            c += i;
        }
        System.out.println(c);

        sc.close();
    }
}