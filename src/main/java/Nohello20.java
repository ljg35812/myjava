public class Nohello20 {
    public static void main(String[] atgs) {

        String str = "      한글    ABCD    efgh       ";
        String cutstr = "";
        String reStr = "";
        boolean res;

        cutstr = str.trim();
        res = str. isEmpty();
        boolean res2 = str.length() == 0;

        System.out.println(cutstr);
        System.out.println(reStr);
        System.out.println(res);
    }
}
