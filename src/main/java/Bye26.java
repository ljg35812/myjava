public class Bye26 {
    public static void main(String[] args) {
        int a = 100;
        int b = 300;
        int c = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                c += i;
            }
        }
        System.out.println(c);
    }
}
