/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 5:08 PM
 * Runtime: 1ms
 * Beats: 100%
 */

public class AddDigits {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        int qoldiq = 0;
        int sum = 0;
        if (num < 10) {
            return num;
        }
        while (num > 0) {
            qoldiq = num % 10;
            sum += qoldiq;
            num /= 10;
            if (num == 0 && sum >= 10) {
                num = sum;
                sum = 0;
            } else if (sum < 10 && num <= 0) {
                return sum;
            }
        }
        return 0;
    }
}
