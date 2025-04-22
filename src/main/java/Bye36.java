public class Bye36 {
    public static void main(String[] args) {
        String a = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int b = a.indexOf("\"");
        int c = a.indexOf("/", b);
        int d = a.indexOf(" ", c);
        String e = a.substring(c, d);
        System.out.println(e);
    }
}
