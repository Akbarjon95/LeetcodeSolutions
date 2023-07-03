/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/15/2023.
 * Time: 5:40 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        //int[] nums = {1,2,2,5,3,5};
        //int[] nums = {3,2,1};
        //int[] nums = {2,2,3,1};
        //int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        //int[] nums = {5,2,4,1,3,6,0};
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};

        tridMax(nums);
    }

    private static int tridMax(int[] nums) {
        int k = 0;
        boolean isFinish = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            isFinish = false;
            if (a != nums[i]) {
                k++;
                a = nums[i];
                isFinish = true;
            }
//            if (k == 3){
//                return a;
//            }
            if (i == nums.length - 1 && isFinish) {
                k++;
            }
        }

        if (k == 3 && nums.length > 3) {
            return a;
        }

        if (k < 2) {
            return nums[0];
        }

        if (k == nums.length) {
            return nums[2];
        }

        if (k == 0 && nums.length > 3) {
            return nums[2];
        }

        if (nums.length < 3) {
            return nums[0];
        } else if (nums.length == 3 && (nums[0] == nums[1] || nums[1] == nums[2])) {
            return nums[0];
        }
        if (nums.length > 3) {
            return nums[nums.length - 2];
        }
        return nums[nums.length - 1];
    }
}
