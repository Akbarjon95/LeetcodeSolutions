import java.util.HashSet;
import java.util.Set;

/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 3:21 PM
 * Runtime: 8ms
 * Beats: 99.7%
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 1};
        containsDuplicate(nums);
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (final int num : nums)
            if (!seen.add(num))
                return true;
        return false;
    }
}
