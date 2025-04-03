import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj29 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        int tInt = Integer.parseInt(t);

        for (int c= 0; c < tInt; c++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(a + b);

        }
        br.close();
    }
}