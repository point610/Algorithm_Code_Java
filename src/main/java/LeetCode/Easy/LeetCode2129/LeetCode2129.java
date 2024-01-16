package LeetCode.Easy.LeetCode2129;

/**
 * @ClassName LeetCode2129
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:33
 * @Version 1.0
 */
class Solution {
    String change(String s) {
         s = s.toLowerCase();
        if (s.length() <= 2) {
            return s;
        }
        return ((char) (s.charAt(0) - 32)) + s.substring(1);

    }

    public String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        int size = strings.length;
        for (int i = 0; i < size; i++) {
            strings[i] = change(strings[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(strings[i]);
            if (i != size - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode2129 {
}
