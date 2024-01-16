package LeetCode.Easy.LeetCode1455;

/**
 * @ClassName LeetCode1455
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 0:39
 * @Version 1.0
 */
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        int size = strings.length;
        for (int i = 0; i < size; i++) {
            if (strings[i].indexOf(searchWord)==0) {
                return i + 1;
            }
        }
        return -1;
    }
}

public class LeetCode1455 {
}
