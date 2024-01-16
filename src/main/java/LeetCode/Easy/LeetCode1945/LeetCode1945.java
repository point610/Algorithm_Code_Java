package LeetCode.Easy.LeetCode1945;

/**
 * @ClassName LeetCode1945
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 17:21
 * @Version 1.0
 */
class Solution {
    int str2int(String str) {
        int sum = 0;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }

    String str2str(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(String.valueOf(s.charAt(i) - 'a' + 1));
        }
        return stringBuilder.toString();
    }

    public int getLucky(String s, int k) {

        k--;
        int res = str2int(str2str(s));
        for (int i = 0; i < k; i++) {
            res = int2int(res);
        }
        return res;
    }

    private int int2int(int temp) {
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;

    }
}

public class LeetCode1945 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getLucky("iiii", 1);
    }
}
