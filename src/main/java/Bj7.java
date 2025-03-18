import java.util.Scanner;

public class Bj7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        a = sc.nextDouble();
        b = sc.nextDouble();

        if(b==0) {
            System.out.println("0으로 나눌수 없습니다");
        }else {
            System.out.print(a/b);
        }

        sc.close();
    }
}