import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();
        int tInt = Integer.parseInt(t);

        for (int c = 0; c < tInt; c++) {

            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println("Case #" +  c +": " + (a + b));
        }
        br.close();
    }
}