public class Book6 {
    public static void main(String[] args) {
        String ss = "java";
        System.out.println("원본 문자열 ==> " + ss);
        String newSS = "";

        newSS = ss.substring(0,1).toLowerCase();
        newSS += ss.substring(1,2).toUpperCase();
        newSS += ss.substring(2,3).toLowerCase();
        newSS += ss.substring(3,4).toUpperCase();

        System.out.println("변환 문자열 ==> ");
        System.out.println(newSS);
    }
}
