package Warmup1;

public class MissingChar {

    public static String missingChar (String str, int n) {
        String first = str.substring(0, n);
        String second = str.substring(n + 1);

        return first + second;

    }

    public static void main (String [] args) {
        System.out.println(missingChar("candy", 0));
        System.out.println(missingChar("candy", 2));
        System.out.println(missingChar("candy", 4));
    }
}
