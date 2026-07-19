package Warmup1;

public class NearHundred {

    public static boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(91));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(111));
        System.out.println(nearHundred(105));
        System.out.println(nearHundred(210));
    }
}
