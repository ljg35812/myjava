public class Nohello51 {
    static int snowman(int a1, int a2) {
        int b;
        b = a1 + a2;
        return b;
    }

    public int snowman2(int a3, int a4) {
        int b1;
        b1 = a3 + a4;
        return b1;
    }

    public static void main(String[] args) {
        int c = snowman(10, 20);
        System.out.println(c);

        System.out.println();

        Nohello51 k = new Nohello51();
        int c2 = snowman(10, 20);
        System.out.println(c2);

        System.out.println();

        int c1 = new Nohello51().snowman2(10, 20);
        System.out.println(c1);
    }
}
