import java.util.Scanner;

public class Nohello36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b, c;

        while(true) {
            System.out.print("숫자1 ==> ");
            b = sc.nextInt();
            System.out.print("숫자2 ==> ");
            c = sc.nextInt();

            a = b + c;
            System.out.println(b + " + " + c + " = " + a);
        }
    }
}