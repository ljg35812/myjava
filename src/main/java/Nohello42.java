class Rabbit6 {
    String shape;
    int xPos;
    int yPos;

    void move(int x,int y) {
        this.xPos = x;
        this.yPos = y;
        System.out.println(xPos + "xPos " + yPos + "yPos");
    }
}

class HouseRabbit extends Rabbit6 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("난 지정된 함수이다.!");
    }
}

class MountainRabbit extends Rabbit6 {
    String Mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }

}

public class Nohello42 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        mRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.Mountain = "살악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildglass();
    }

}
