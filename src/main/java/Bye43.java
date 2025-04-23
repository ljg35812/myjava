abstract class Fish4 {
    abstract void swim();
}

class GoldFish4 extends Fish4 {
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Bye43 {
    public static void main(String[] args) {
        GoldFish4 gf = new GoldFish4();
        gf.swim();
    }
}