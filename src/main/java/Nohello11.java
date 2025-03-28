import java.util.Scanner;

public class Nohello11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("필기시험 점수를 입력하세요");
        score = sc.nextInt();
        System.out.println(score >= 70);

        sc.close();
   }
}