public class Bye25 {
    public static void main(String[] args) {
        String a = "";
        String b = " ";
        int c = 7;
        int d, e;

        for (int i = 1; i <= c; i += 2) {
            d = (c - i) / 2;
            System.out.print(" ".repeat(d));
            System.out.print("*".repeat(i));
            System.out.println(" ".repeat(d));
        }
    }
}
