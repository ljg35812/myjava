abstract class Fish3 {
    abstract void swim();
}

class GoldFish3 extends Fish3 {
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Bye38 {
    public static void main(String[] args) {
        GoldFish3 gf = new GoldFish3();
        gf.swim();
    }
}