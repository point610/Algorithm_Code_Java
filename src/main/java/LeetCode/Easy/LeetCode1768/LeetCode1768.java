package LeetCode.Easy.LeetCode1768;

/**
 * @ClassName LeetCode1768
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 18:32
 * @Version 1.0
 */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int onesize = word1.length();
        int twosize = word2.length();
        int oneindex = 0;
        int twoindex = 0;
        StringBuilder res = new StringBuilder();
        while (oneindex < onesize && twoindex < twosize) {
            res.append(word1.charAt(oneindex++));
            res.append(word2.charAt(twoindex++));
        }
        while (oneindex < onesize) {
            res.append(word1.charAt(oneindex++));
        }
        while (twoindex < twosize) {
            res.append(word2.charAt(twoindex++));
        }

return res.toString();
    }
}

public class LeetCode1768 {
}
