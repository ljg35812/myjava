import java.util.Scanner;

public class Nohello45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        int b = 0;

        for (int i  = 0; i < 4; i++) {
            System.out.print("숫자 : ");
            a[i] = sc.nextInt();
            b += a[i];
        }
        System.out.println("합계 ==> " + b);

        sc.close();
    }
}