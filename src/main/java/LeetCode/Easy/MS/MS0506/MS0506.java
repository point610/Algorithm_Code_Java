package LeetCode.Easy.MS.MS0506;

/**
 * @ClassName MS0506
 * @Description TODO
 * @Author point
 * @Date 2023/10/11 23:45
 * @Version 1.0
 */
class Solution {
    public int convertInteger(int A, int B) {
        String one = Integer.toBinaryString(A);
        String two = Integer.toBinaryString(B);
        int size = Math.min(one.length(), two.length());
        int diff = 0;
        for (int i = 0; i < size; i++) {
            if (one.charAt(one.length() - i - 1) != two.charAt(two.length() - 1 - i)) {
                diff++;
            }
        }
        if (one.length() > two.length()) {
            for (int i = 0; i < one.length() - size; i++) {
                if (one.charAt(i) == '1') {
                    diff++;
                }
            }
        } else {
            for (int i = 0; i < two.length() - size; i++) {
                if (two.charAt(i) == '1') {
                    diff++;
                }
            }
        }
        return diff;
    }
}

public class MS0506 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertInteger(528611498, -1619967984));
    }
}
