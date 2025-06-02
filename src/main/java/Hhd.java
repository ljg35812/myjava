import java.util.Random;
import java.util.Scanner;

public class Hhd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean bl = false;
        boolean bl2 = false;
        String []trump = {
                "♤A", "♤2", "♤3", "♤4", "♤5", "♤6", "♤7", "♤8", "♤9", "♤10", "♤J", "♤Q", "♤K",
                "♡A", "♡2", "♡3", "♡4", "♡5", "♡6", "♡7", "♡8", "♡9", "♡10", "♡J", "♡Q", "♡K",
                "◇A", "◇2", "◇3", "◇4", "◇5", "◇6", "◇7", "◇8", "◇9", "◇10", "◇J", "◇Q", "◇K",
                "♧A", "♧2", "♧3", "♧4", "♧5", "♧6", "♧7", "♧8", "♧9", "♧10", "♧J", "♧Q", "♧K"
        };

        System.out.print("게임 로딩중");

        while (!bl) {

            try {
                for (int i = 1; i <= 5; i++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
                System.out.println();
                bl = true;

            } catch (InterruptedException e) {
                System.out.println("오류 다시 실행중");
            }

        }

        System.out.println("게임시작");

        while (!bl2) {

            try {
                Thread.sleep(1000);
                System.out.println("누구나 좋아하는 블랙잭");
                bl2 = true;

            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        while (true)  {
            try {
                System.out.println("카드를 뽑기(a)");
                String card = sc.nextLine();

                if (card.equals("a")) {
                    int deck = rd.nextInt(52);
                    System.out.println(trump[deck]);
                    System.out.println(trump[deck]);
                }

            } catch (Exception e) {
                System.out.println("a값만 입력해 주세요");
            }
        }

    }
}