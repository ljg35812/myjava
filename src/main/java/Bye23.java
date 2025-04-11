public class Bye23 {
    public static void main(String[] args){
        String a = "";
        String b = "****";
        int c, d;

        for (c = 0; c <= 3; c++) {
            a += "*";
            System.out.println(a);
        }
        for (d = 2; d >= 0; d--) {
            b = b.substring(0, b.length() -1);
            System.out.println(b);
        }
    }
}