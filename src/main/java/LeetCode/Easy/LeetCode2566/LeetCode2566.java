package LeetCode.Easy.LeetCode2566;

/**
 * @ClassName LeetCode2566
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 10:29
 * @Version 1.0
 */
class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int size = str.length();
        char c = '0';
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != '9') {
                c = str.charAt(i);
                break;
            }
        }
        int max = Integer.parseInt(str.replace(c, '9'));

        int min = Integer.parseInt(str.replace(str.charAt(0), '0'));

        return max - min;
    }
}

public class LeetCode2566 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minMaxDifference(11891));
    }
}
