package LeetCode.Easy.LeetCode2047;

/**
 * @ClassName LeetCode2047
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 10:58
 * @Version 1.0
 */
class Solution {
    boolean one(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                return false;
            }
        }
        return true;
    }

    boolean two(String s) {
        int size = s.length();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '-') {
                sum++;
            }
        }
        if (sum > 1) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        int index = s.indexOf('-');
        if (index == 0 || index == size - 1) {
            return false;
        }

        if ('a' <= s.charAt(index - 1) && s.charAt(index - 1) <= 'z'
                && 'a' <= s.charAt(index + 1) && s.charAt(index + 1) <= 'z') {
            return true;
        }

        return false;
    }

    boolean three(String s) {
        int size = s.length();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',') {
                sum++;
            }
        }
        if (sum > 1) {
            return false;
        }
        if (sum == 0) {
            return true;
        }
        if (s.indexOf('!') == size - 1 || s.indexOf('.') == size - 1 || s.indexOf(',') == size - 1) {
            return true;
        }


        return false;
    }

    public int countValidWords(String sentence) {
        String[] strings = sentence.split(" ");
        int size = strings.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (strings[i].length() == 0) {
                continue;
            }
            if (one(strings[i]) && two(strings[i]) && three(strings[i])) {
                sum++;
            }
        }
        return sum;
    }
}

public class LeetCode2047 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countValidWords( "!this  1-s b8d!"));
    }
}
