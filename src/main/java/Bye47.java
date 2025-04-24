abstract class Fish5 {
    abstract void swim();
}

class GoldFish5 extends Fish3 {
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Bye47 {
    public static void main(String[] args) {
        GoldFish5 gf = new GoldFish5();
        gf.swim();
    }
}