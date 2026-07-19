package Warmup2;

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Celine", 2));
        System.out.println(frontTimes("Celine", 3));
        System.out.println(frontTimes("No", 3));
    }

    public static String frontTimes (String str, int n) {
        String front;

        if (str.length() < 3) {
            front = str;
        } else {
            front =str.substring(0,3);
        }

        String result = "";

        for (int i = 0; i < n; i ++) {
            result = result +front;
        }
        return result;
    }
}
