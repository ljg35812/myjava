import java.util.Scanner;

public class Nohello44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        int b = 0;

        for (int i  = 0; i < 4; i++) {
            System.out.println("숫자 : ");
            a[i] = sc.nextInt();
        }

        b = a[0] + a[1] + a[2] + a[3];
        System.out.println(b);

        sc.close();
    }
}