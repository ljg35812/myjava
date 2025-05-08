import java.util.Arrays;
import java.util.Comparator;

public class Nohello46 {
    public static void main(String[] args) {
        int a[] = {33, 66, 11, 77, 88, 44};
        Arrays.sort(a);
        for (int data : a) {
                System.out.print(data + " ");
        }
        System.out.println();

        String [] b = {"한빛", "아카데미", "난생", "자바", "열공"};
        Arrays.sort(b, Comparator.reverseOrder());
        for (String data : b) {
            System.out.print(data + " ");
        }
    }
}