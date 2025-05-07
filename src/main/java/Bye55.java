abstract class Fish6 {
    abstract void swim();
}

class GoldFish6 extends Fish6 {
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}
public class Bye55 {
    public static void main(String[] args) {
        GoldFish6 gf = new GoldFish6();
        gf.swim();
    }
}