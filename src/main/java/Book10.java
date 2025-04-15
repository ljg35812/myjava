class Rabbit2 {
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Book10 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();

       rabbit1.setposition(100, 200);
    }
}