class Rabbit {
    String shape;
    int xpos;
    int ypos;

    void setposition(int x, int y) {
        xpos = x;
        ypos = y;

        System.out.println("Rabbit setposition(" + x + ", " + y + ")");
    }
}

public class Nohello39 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setposition(100, 100);
        rabbit2.setposition(-100, 100);
        rabbit3.setposition(0, -100);

    }
}