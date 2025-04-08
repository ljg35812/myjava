public class Bye11 {
    public static void main(String[] args) {
        int a;
        int b;
        String c = "";
        String d = "****";

        for (a = 0; a <= 3; a++) {
           c += "*";
            System.out.println(c);
        }

        if (a == 4) {
            for (b = 0; b <= 2; b++) {
                d = d.substring(0, d.length() -1);
                System.out.println(d);
            }
        }
    }
}
