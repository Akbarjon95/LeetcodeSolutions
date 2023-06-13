/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/13/2023.
 * Time: 4:14 PM
 * Runtime: 4ms
 * Beats: 99.7%
 */

public class MultiplyStringsOther {
    public static void main(String[] args) {
        String num1 = "123456789", num2 = "987654321";
        System.out.println(multiply2(num1, num2));
    }

    public static String multiply2(String num1, String num2) {
        final int m = num1.length();
        final int n = num2.length();

        StringBuilder sb = new StringBuilder();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; --i)
            for (int j = n - 1; j >= 0; --j) {
                final int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                final int sum = multiply + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }

        for (final int p : pos)
            if (p > 0 || sb.length() > 0)
                sb.append(p);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
