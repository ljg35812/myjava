class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    Rabbit1() {
        shape = "토끼";
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Book9 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();

        System.out.printf("토끼 객체의 기본 모양은 [%s] 입니다.", rabbit1.shape);
    }
}