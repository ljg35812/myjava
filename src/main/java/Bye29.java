abstract class Fish {
    abstract void swim();
}
class GoldFish extends Fish {
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Bye29 {
    public static void main(String[] args) {
        GoldFish gf = new GoldFish();

        gf.swim();
    }
}