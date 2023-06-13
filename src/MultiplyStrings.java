import java.math.BigInteger;

/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/13/2023.
 * Time: 3:45 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123456789", num2 = "987654321";
        System.out.println(multiply(num1, num2));
    }

    private static String multiply(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);

        return number1.multiply(number2) + "";
    }


}
