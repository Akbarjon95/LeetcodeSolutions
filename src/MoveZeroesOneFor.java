/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/15/2023.
 * Time: 5:21 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MoveZeroesOneFor {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    private static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0){
                int t = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = t;
            }
        }
    }
}
