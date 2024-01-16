package LeetCode.Easy.LeetCode1935;

/**
 * @ClassName LeetCode1935
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 16:54
 * @Version 1.0
 */
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        if (brokenLetters.length() == 26) {
            return 0;
        }
        String[] strings = text.split(" ");
        int size = strings.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < brokenLetters.length(); j++) {
                if (strings[i].indexOf(brokenLetters.charAt(j)) != -1) {
                    sum++;
                    break;
                }
            }

        }
        return size-sum;
    }
}

public class LeetCode1935 {
}
