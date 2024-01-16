package LeetCode.Easy.LeetCode2710;

/**
 * @ClassName LeetCode2710
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:51
 * @Version 1.0
 */
class Solution {
    public String removeTrailingZeros(String num) {
        if (num.charAt(num.length() - 1) != '0') {
            return num;
        }
        int index = num.length() - 1;
        while (num.charAt(index) == '0') {
            index--;
        }
        return num.substring(0, index + 1);
    }
}


public class LeetCode2710 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeTrailingZeros("51230100"));
    }
}
