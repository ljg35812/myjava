public class Bye31 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
        int a = log.indexOf("\"");
        int b = log.indexOf("/", a);
        int c = log.indexOf(" ", b);
        String d = log.substring(b, c);
        System.out.println(d);
    }
}
