import java.math.BigInteger;

/**
 * Created by: Akbar
 * Date: 6/13/2023.
 * Time: 12:02 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }
        sum = sum.add(BigInteger.ONE);
        int count = String.valueOf(sum).length();
        int[] myNum = new int[count];
        while (count > 0) {
            myNum[--count] = (sum.remainder(BigInteger.TEN)).intValue();
            sum = sum.divide(BigInteger.TEN);
        }
        return myNum;
    }
}
