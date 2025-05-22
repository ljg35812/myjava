import java.util.ArrayList;
import java.util.List;

public class Bye72 {
    public static void main(String[] args){
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            ls.add(i);
        }

        for (int a : ls) {
            System.out.print(a + " ");
        }

        System.out.println();
        ls.forEach(b -> System.out.print(b + " "));
    }
}