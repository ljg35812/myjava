import java.util.Scanner;

public class Bye2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("정수b를 엽력하세오: ");
        int b = sc.nextInt();

        double c = (double) a / b;

        System.out.println(c);
        sc.close();
    }
}