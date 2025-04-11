public class Nohello38 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 4 != 0) {
                a += i;
            }
        }
        System.out.println(a);
    }
}
