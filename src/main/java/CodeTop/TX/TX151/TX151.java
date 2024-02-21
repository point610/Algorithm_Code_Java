package CodeTop.TX.TX151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        if (s.isEmpty()) {
            return s;
        }
        String[] split = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String string : split) {
            if (!string.isEmpty()) {
                list.add(string);
            }
        }
        Collections.reverse(list);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            stringBuilder.append(' ');
            stringBuilder.append(list.get(i));
        }

        return stringBuilder.toString();
    }
}

public class TX151 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));
        System.out.println(solution.reverseWords("  hello world  "));
        System.out.println(solution.reverseWords("a good   example"));
    }
}
