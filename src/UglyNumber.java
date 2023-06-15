/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 6:14 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class UglyNumber {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(uglyNumber(n));
    }

    private static boolean uglyNumber(int n) {
        if (n < 2 && n > 0) return true;
        if (n <= 0) return false;
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        if (n == 1) {
            return true;
        } else return false;
    }
}
