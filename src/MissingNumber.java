import java.util.Arrays;

/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 7:07 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        boolean isMissing = true;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                isMissing = false;
                return i;
            }
        }
        if (isMissing) {
            return nums.length;
        }
        return 0;
    }
}
