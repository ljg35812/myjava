import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bye60{
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int a = Integer.MIN_VALUE;
        System.out.print("배열개수 입력 : ");
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            ls.add(sc.nextInt());
            if (ls.get(i) > a) {
                a = ls.get(i);
            }
        }
        System.out.println("가장큰수: " + a);

        sc.close();
    }
}