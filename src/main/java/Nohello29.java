import java.util.Scanner;

public class Nohello29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~3 중에 선택하세요 :");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("2를 선택했습니다.");
                break;
            case 3:
                System.out.println("3를 선택했습니다.");
                break;
            default:
                System.out.println("이상한 것을  선택했습니다.");
        }
        sc.close();
    }
}