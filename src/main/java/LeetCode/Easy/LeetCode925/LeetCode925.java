package LeetCode.Easy.LeetCode925;

/**
 * @ClassName LeetCode925
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 23:30
 * @Version 1.0
 */
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int oneSize = name.length();
        int twoSize = typed.length();
        if (twoSize < oneSize) {
            return false;
        }

        int oneIndex = 0;
        int twoIndex = 0;
        char last = name.charAt(0);

        while (oneIndex < oneSize && twoIndex < twoSize) {
            if (name.charAt(oneIndex) != last) {
                // typed要移动到与last不同的
                while (twoIndex < twoSize && typed.charAt(twoIndex) == last) {
                    twoIndex++;
                }
                last = name.charAt(oneIndex);

            } else if (name.charAt(oneIndex) == typed.charAt(twoIndex)) {
                oneIndex++;
                twoIndex++;
            } else {
                return false;
            }
        }
        if (oneIndex != oneSize) {
            return false;
        }

        while (twoIndex < twoSize) {
            if (typed.charAt(twoIndex) != last) {
                return false;
            }
            twoIndex++;
        }

        return true;
    }
}

public class LeetCode925 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isLongPressedName("saeed", "ssaaedd"));
    }
}
