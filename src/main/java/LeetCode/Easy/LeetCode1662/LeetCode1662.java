package LeetCode.Easy.LeetCode1662;

/**
 * @ClassName LeetCode1662
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 13:20
 * @Version 1.0
 */
class Solution {
    String getall(String[] strings) {
        int size = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(strings[i]);
        }
        return String.valueOf(stringBuilder);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return getall(word1).equals(getall(word2));

    }
}

public class LeetCode1662 {
}
