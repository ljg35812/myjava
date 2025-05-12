import java.util.Scanner;

public class Bye56 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("넣고 싶은 배열의 개수 입력 ==> ");
        int a = sc.nextInt();
        int[]b = new int[a];
        System.out.print("넣고 싶은 배열값 입력 ==> ");

        for (int i = 0; i < a; i++) {
            int c = sc.nextInt();
            b[i] = c;
        }

        int d = Integer.MIN_VALUE;

        for (int i = 0; i < a; i++) {
            if (b[i] > d) {
                d = b[i];
            }
        }
        System.out.println("가장 큰 값은 " + d);

        sc.close();
    }
}