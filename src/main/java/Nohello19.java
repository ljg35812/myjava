public class Nohello19 {
    public static void main(String[] atgs) {
        String str = "  한글  ABCD  efgh    ";
        String cutsr = "";

        cutsr = str.trim();

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==> [" +  cutsr + "]");
    }
}
