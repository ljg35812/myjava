import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lebj86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> s = new HashSet<>();
        int a = sc.nextInt();
        int c = 0;

        for (int i  = 0; i < a; i++) {
            String b = sc.next();
            for (int j = 0; j < b.length() - 1; j++) {
                if (b.charAt(j) != (b.charAt(j+ 1))) {
                    char d = b.charAt(j);;
                    if(s.contains(d)) {
                        c--;
                        break;
                    }
                    s.add(d);
                }
            }
            if (b.charAt(b.length()-1) != (b.charAt(b.length() - 1))-1 && s.contains(b.charAt(b.length() - 1))) {
                c--;
                break;
            }
            c++;
        }
        System.out.println(c);
    }
}