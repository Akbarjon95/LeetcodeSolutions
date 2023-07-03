/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 7/3/2023.
 * Time: 4:22 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MaxSubArray {
    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
