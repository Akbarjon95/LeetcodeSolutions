/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/16/2023.
 * Time: 3:52 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        singleNumber(nums);
    }

    public static int singleNumber(int nums[]){

        if (nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            boolean isSingle = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    k++;
                }
            }
            if (k == 1){
                return nums[i];
            }
        }

        return 0;
    }
}
