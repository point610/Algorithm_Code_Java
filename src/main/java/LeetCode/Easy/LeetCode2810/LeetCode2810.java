package LeetCode.Easy.LeetCode2810;

/**
 * @ClassName LeetCode2810
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 22:35
 * @Version 1.0
 */
class Solution {
    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'i') {
                stringBuilder.reverse();
            }else {

                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode2810 {
}
