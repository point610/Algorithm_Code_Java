package LeetCode.Easy.LeetCode1736;

/**
 * @ClassName LeetCode1736
 * @Description TODO
 * @Author point
 * @Date 2023/9/28 16:37
 * @Version 1.0
 */
class Solution {
    public String maximumTime(String time) {
        StringBuilder stringBuilder = new StringBuilder();
        if (time.charAt(0) == '?') {
            if (time.charAt(1) <= '3' || time.charAt(1) == '?') {
                stringBuilder.append('2');
            } else {
                stringBuilder.append('1');
            }
        } else {
            stringBuilder.append(time.charAt(0));
        }
        // ++++++++++++++++++++++++++++++++++++++++
        if (time.charAt(1) == '?') {
            if (stringBuilder.charAt(0) != '2') {
                stringBuilder.append('9');
            } else {
                stringBuilder.append('3');
            }
        } else {
            stringBuilder.append(time.charAt(1));
        }
        // ++++++++++++++++++++++++++++++++++++++++
        stringBuilder.append(':');

        if (time.charAt(3) == '?') {
            stringBuilder.append('5');
        } else {
            stringBuilder.append(time.charAt(3));
        }
        // ++++++++++++++++++++++++++++++++++++++++
        if (time.charAt(4) == '?') {
            stringBuilder.append('9');
        } else {
            stringBuilder.append(time.charAt(4));
        }
        // ++++++++++++++++++++++++++++++++++++++++
        return String.valueOf(stringBuilder);
    }
}

public class LeetCode1736 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumTime("??:3?"));
    }
}
