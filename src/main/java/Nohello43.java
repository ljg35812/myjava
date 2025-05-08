interface Rabbit {
    abstract void sleep();
}

class HouseRabbit implements Rabbit {
    public void sleep() {
        System.out.println("집토끼가 우리속에서 잠자고 있습니다.");
    }
}

class MountainRabbit implements Rabbit {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 자고있습니다.");
    }
}

public class Nohello43 {
    public static void main(String[] args) {
        HouseRabbit hr = new HouseRabbit();
        MountainRabbit mr = new MountainRabbit();
        hr.sleep();
        mr.sleep();
    }
}