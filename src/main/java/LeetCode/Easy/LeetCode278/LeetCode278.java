package LeetCode.Easy.LeetCode278;

/**
 * @ClassName LeetCode278.LeetCode278
 * @Description TODO
 * @Author point
 * @Date 2023/7/12 18:09
 * @Version 1.0
 */
/* The isBadVersion API is defined in the parent class LeetCode278.VersionControl.
      boolean isBadVersion(int version); */

class VersionControl {
    boolean isBadVersion(int version) {
        if (version >= 1702766719) {
            return true;
        } else {
            return false;
        }
    }
}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
            int mid = left + (right - left) / 2;
        while (true) {
            if (left + 1 >= right) {
                if (isBadVersion(left)) {
                    return left;
                } else {
                    return right;
                }
            }
            if (isBadVersion(mid)) {
                right = mid;
                mid = left + (right - left) / 2;
            } else {
                left = mid;
                mid = left + (right - left) / 2;
            }
        }
    }
}

public class LeetCode278 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(2126753390));
    }
}
