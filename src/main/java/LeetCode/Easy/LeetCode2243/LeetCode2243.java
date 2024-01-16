package LeetCode.Easy.LeetCode2243;

/**
 * @ClassName LeetCode2243
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:27
 * @Version 1.0
 */
class Solution {
    String sub(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        int i = 0;
        for (i = 0; i < size && i + k < size; i += k) {
            stringBuilder.append(getnumber(s.substring(i, i + k)));
        }
        stringBuilder.append(getnumber(s.substring(i)));
        return stringBuilder.toString();
    }

    String getnumber(String s) {
        int sum = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            sum += s.charAt(i) - '0';
        }
        return String.valueOf(sum);
    }

    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        String temp = s;
        while (true) {
            temp = sub(temp, k);
            if (temp.length() <= k) {
                return temp;
            }
        }

    }
}

public class LeetCode2243 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.digitSum("11111222223", 3));
    }
}
