package Warmup1;

public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0) {
            return true;
        }
        if (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(posNeg(1, -2, false));
        System.out.println(posNeg(-3, 5, false));
        System.out.println(posNeg(-8, -2, true));
        System.out.println(posNeg(-1, -1, false));
    }
}
