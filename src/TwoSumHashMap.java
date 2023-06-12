import java.util.HashMap;

//Runtime 1ms
public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSumHashMap(nums, target);
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.get(complement) != null && hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement),i};
            } else {
                hashMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
