//Runtime: 9ms
//Beats: 99.17%
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        isPalindrome(x);
    }

    public static boolean isPalindrome(int x) {
        int orginal = x;
        int sum = 0;
        int residual;
        while (x >= 1) {
            residual = x % 10;
            sum = sum * 10 + residual;
            x /= 10;
        }
        if (orginal == sum) {
            return true;
        } else
            return false;
    }
}
