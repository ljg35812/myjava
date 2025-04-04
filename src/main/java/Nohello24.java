import java.util.Scanner;

public class Nohello24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 100) {
            System.out.println(a);
        } else {
            System.out.println(a + "는 100보다 큽니다");
        }
    }
}