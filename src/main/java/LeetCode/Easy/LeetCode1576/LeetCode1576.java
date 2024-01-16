package LeetCode.Easy.LeetCode1576;

/**
 * @ClassName LeetCode1576
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 0:34
 * @Version 1.0
 */
class Solution {
    public String modifyString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        if (size == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            } else {
                return s;
            }
        }

        if (s.charAt(0) == '?') {
            char temp = 'a';
            while (temp == s.charAt(1)) {
                temp = (char) (temp + 1);
            }
            stringBuilder.append(temp);
        } else {
            stringBuilder.append(s.charAt(0));
        }

        for (int i = 1; i < size - 1; i++) {
            if (s.charAt(i) == '?') {
                char temp = 'a';
                while (temp == stringBuilder.charAt(stringBuilder.length() - 1) || temp == s.charAt(i + 1)) {
                    temp = (char) (temp + 1);
                }
                stringBuilder.append(temp);
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }

        if (s.charAt(size - 1) == '?') {
            char temp = 'a';
            while (temp == stringBuilder.charAt(size - 2)) {
                temp = (char) (temp + 1);
            }
            stringBuilder.append(temp);
        } else {
            stringBuilder.append(s.charAt(size - 1));
        }
        return stringBuilder.toString();

    }
}

public class LeetCode1576 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.modifyString("j?qg??b"));
    }
}
