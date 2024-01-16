package LeetCode.Easy.LeetCode2264;

/**
 * @ClassName LeetCode2264
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 19:13
 * @Version 1.0
 */
class Solution {
    public String largestGoodInteger(String num) {

        int size = num.length();
        String res = "";
        for (int i = 0; i < size - 2; i++) {
            if (i != 0 && num.charAt(i - 1) == num.charAt(i)) {
                continue;
            }
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if ("".equals(res)) {
                    res = num.substring(i, i + 3);
                    continue;
                }
                if (res.charAt(0) < num.charAt(i)) {
                    res = num.substring(i, i + 3);
                }
            }
        }
        return res;
    }
}

public class LeetCode2264 {
    public static void main(String[] args) {
        Solution
                solution = new Solution();
        System.out.println(solution.largestGoodInteger("6777133339"));
    }
}
