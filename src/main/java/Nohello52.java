public class Nohello52 {
    static int snowman(int v1, int v2) {
        int c = v1 + v2;
        return c;
    }

    static long snowman(int v1, int v2, int v3) {
        long c = v1 + v2 + v3;
        return c;
    }

    public static void main(String[] args) {
        long e = snowman(10, 20);
        System.out.println(e);

        e = snowman(10, 20, 30);
        System.out.println(e);
    }
}
