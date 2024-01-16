package LeetCode.Easy.LeetCode2042;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2042
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 10:40
 * @Version 1.0
 */
class Solution {
    public boolean areNumbersAscending(String s) {
        List<String> list = new LinkedList<>();

        int size = s.length();
        for (int i = 0; i < size; i++) {

            if (isNumber(s.charAt(i))) {
                int startindex = i;
                while (i < size && isNumber(s.charAt(i))) {
                    i++;
                }
                list.add(s.substring(startindex, i));
            }
        }
        size = list.size();
        for (int i = 1; i < size; i++) {
            if (islarge(list.get(i - 1), list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean islarge(String one, String two) {
        if (one.length() > two.length()) {
            return true;
        }

        if (one.length() < two.length()) {
            return false;
        }

        int size = two.length();
        for (int i = 0; i < size; i++) {

            if (one.charAt(i) > two.charAt(i)) {
                return true;
            }

            if (one.charAt(i) < two.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private boolean isNumber(char charAt) {
        return '0' <= charAt && charAt <= '9';
    }
}

public class LeetCode2042 {
}
