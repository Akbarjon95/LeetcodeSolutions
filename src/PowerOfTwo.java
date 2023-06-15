/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 2:48 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(16 & 15);
        int x = 15;
        isPowerOfTwo(x);
    }

    private static boolean isPowerOfTwo(int n) {

        return n < 1 ? false : (n & (n - 1)) == 0 ? true : false;
    }
}
