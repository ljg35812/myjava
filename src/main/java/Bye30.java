import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bye30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<Integer>();
        System.out.println("문장 입력 ==> ");
        String a = sc.nextLine();
        System.out.println("찾을 단어 입력");
        String b = sc.nextLine();

        char []arr = new char[a.length()];
        char []arr2 = new char[a.length()];

        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i);
        }

    }
}