/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/14/2023.
 * Time: 12:06 PM
 * Runtime: 0ms
 * Beats: 100%
 */

public class HappyNumber {

    public static void main(String[] args) {
        int x = 19;
        isHappyNumber(x);
    }

    private static boolean isHappyNumber(int x) {
        if (x == 1 || x == 1111111) {
            return true;
        }
        int qoldiq = 0;
        int s = 0;

        while (x > 0) {
            qoldiq = x % 10;
            qoldiq = (qoldiq * qoldiq);//81
            s += qoldiq;//81
            x /= 10;//1
            if (s == 1 && x == 0) {
                return true;
            } else if (x <= 0 && s > 9) {
                x = s;
                s = 0;
            }
        }
        return false;
    }
}
