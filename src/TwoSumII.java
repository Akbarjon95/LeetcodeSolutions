
//Runtime: 1ms
//Beats: 99.17%
public class TwoSumII {
    private static int[] numbers = {2, 7, 11, 15};
    private static int target = 9;

    public static void main(String[] args) {
        System.out.println(twoSum(numbers, target));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                return new int[]{++left, ++right};
            }
        }
        return new int[]{};
    }
}
