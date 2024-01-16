package CodeTop.HW.HW9;

/**
 * @ClassName HW9
 * @Description TODO
 * @Author point
 * @Date 2023/12/24 15:30
 * @Version 1.0
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String one = String.valueOf(x);
        for (int i = 0, j = one.length() - 1; i < j; i++, j--) {
            if (one.charAt(i) != one.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

public class HW9 {
}
