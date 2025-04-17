class Rabbit4 {
    String shape = " ";

    Rabbit4() {
        System.out.println("난 자바가 기본으로 만들어주는 생성자");
    }

    Rabbit4(String value) {
         shape = value;
    }
}

public class Nohello40 {
    public static void main(String[] args) {
        Rabbit4 rabbit1 = new Rabbit4("원");
        Rabbit4 rabbit2 = new Rabbit4("삼각형");
        Rabbit4 rabbit3 = new Rabbit4("토끼");

        System.out.printf("토끼1 객체 모양은 [%s]입니다. \n", rabbit1.shape);
        System.out.printf("토끼2 객체 모양은 [%s]입니다. \n", rabbit2.shape);
        System.out.printf("토끼3 객체 모양은 [%s]입니다. \n", rabbit3.shape);
    }
}