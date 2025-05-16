public class Bye61 {
    public static void main(String[] args) {
        int a[] = {1, 3, 7, 1, 9};
        int b = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }
        System.out.println(b);
    }
}
