package Warmup1;

public class Front3 {

    public static String front3(String str) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        return front + front + front;

    }
    public static void main (String[] args) {
        System.out.println(front3("java"));
        System.out.println(front3("sweet"));
        System.out.println(front3("in"));
    }

}
