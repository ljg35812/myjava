abstract class Fish1{
    abstract void swim();
}

class GoldFish1 extends Fish1{
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}

public class Bye34 {
    public static void main(String[] args) {
        GoldFish1 gf = new GoldFish1();
        gf.swim();
    }
}