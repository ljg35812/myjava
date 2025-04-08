public class Bye12 {
    public static void main(String[] args) {
       String a = "";
       String d = "****";
       int b;
       int c;

       for (b = 0; b <= 3; b++) {
           a += "*";
           System.out.println(a);
       }
       if (b == 4) {
           for (c = 2; c >= 0; c--) {
               d = d.substring(0, d.length() - 1);
               System.out.println(d);
           }
       }
    }
}
