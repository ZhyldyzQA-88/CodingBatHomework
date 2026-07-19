package Warmup1;

public class NotString {

    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public static void main(String[] args) {
        System.out.println(notString("good"));
        System.out.println(notString("not bad"));
        System.out.println(notString("car"));
    }
}
