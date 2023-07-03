/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/16/2023.
 * Time: 2:51 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class ThirdMaxNumber {
    public static void main(String[] args) {
        //int[] nums = {1,2,2,5,3,5};
        //int[] nums = {3,2,1};
        //int[] nums = {2,2,3,1};
        //int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        //int[] nums = {5,2,4,1,3,6,0};
        //int[] nums = {3,2,3,1,2,4,5,5,6};
        int[] nums = {3,2,1};

        tridMax(nums);
    }

    private static int tridMax(int[] nums){
       int [] b = new int[nums.length];

        int a = nums[0];
        b[0] = a;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (a != nums[i]){
                b[++k] = nums[i];
                a = nums[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] < b[j]) {
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        if(k >= 2){
            return b[2];
        }
        if(k >= 1){
            return nums[0];
        }
        return nums[0];

    }

}
