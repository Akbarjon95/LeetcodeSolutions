//Runtime: 9 ms
//Beats: 13.34%

import java.util.HashMap;

public class RomanToIntegerHashMap {
    public static void main(String[] args) {
        romanToInteger("XL");
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += hashMap.get(s.charAt(i));

        }
        return sum;
    }
}
