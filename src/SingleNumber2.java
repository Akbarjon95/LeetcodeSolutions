public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 1, 1};
        singleNumber(nums);
    }

    public static int singleNumber(int nums[]) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }
}
