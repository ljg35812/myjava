public class Bye40 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

       int a = log.indexOf("/apache_pb.gif");
       int b = log.indexOf(" ", a);
       String c = log.substring(a, b);

        System.out.println(c);
    }
}
