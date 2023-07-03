/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/15/2023.
 * Time: 2:13 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int nums[]){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    //n--;
                    //j = n;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
