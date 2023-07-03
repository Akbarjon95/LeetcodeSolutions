import java.math.BigInteger;

/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/16/2023.
 * Time: 8:28 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";

        addString(num1, num2);
    }

    public static String addString(String num1, String num2){
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.add(b);
        return c.toString();
    }
}
