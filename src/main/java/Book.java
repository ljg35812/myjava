import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String personName, personAddr;
        int weight;

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");

        System.out.print("받는 사람 :" );
        personName = sc.nextLine();
        System.out.print("주소 :");
        personAddr = sc.nextLine();
        System.out.print("무게 :");
        weight = sc.nextInt();

        System.out.println("** 받는 사람 ==>" + personName);
        System.out.println("** 주소 ==>" + personAddr);
        System.out.println("** 배송비 ==>" + (weight * 5) + "원");

        sc.close();
    }
}