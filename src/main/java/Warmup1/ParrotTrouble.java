package Warmup1;

public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 21));
        System.out.println(parrotTrouble(false, 3));
        System.out.println(parrotTrouble(true, 23));

    }
}
