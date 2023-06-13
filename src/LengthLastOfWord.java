/**
 * Created by: Akbarjon Akhmadjonov
 * Date: 6/13/2023.
 * Time: 3:31 PM
 * Runtime: 1ms
 * Beats: 47.8%
 */

public class LengthLastOfWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

    private static int lengthOfLastWord(String s) {
        String[] splitArray = s.split(" ");
        int lastWordLength = splitArray[0].length();
        for(String item : splitArray){
            if (!item.isEmpty()) {
                lastWordLength = item.length();
            }
        }
        return lastWordLength;
    }
}
