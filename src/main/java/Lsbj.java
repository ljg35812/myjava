import java.util.Scanner;

public class Lsbj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("장난치지 마세요");
        } else if (a >= 90) {
            System.out.println("A");
        }else if (a >= 80) {
            System.out.println("B");
        }else if (a >= 70) {
            System.out.println("C");
        }else if (a >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

        sc.close();
    }
}