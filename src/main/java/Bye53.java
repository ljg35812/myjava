public class Bye53 {
    public static void main (String[] args) {
        String s = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int a = s.indexOf("GET") + 4;
        int b = s.indexOf(" ", a);
        String c= s.substring(a, b);

        System.out.println(c);
    }
}
