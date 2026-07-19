package Warmup1;

public class Diff21 {

    public static int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    public static void main(String[] args) {
        System.out.println(diff21(18));
        System.out.println(diff21(5));
        System.out.println(diff21(30));
        System.out.println(diff21(22));
    }
}
