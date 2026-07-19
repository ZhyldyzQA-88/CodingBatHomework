package Array1;

public class SameFirstLast {
    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));
        System.out.println(sameFirstLast(new int[]{7}));

    }
    public static boolean sameFirstLast(int[] nums) {

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }

        return false;
    }
}
