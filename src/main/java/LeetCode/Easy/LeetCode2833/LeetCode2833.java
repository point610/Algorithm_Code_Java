package LeetCode.Easy.LeetCode2833;

/**
 * @ClassName LeetCode2833
 * @Description TODO
 * @Author point
 * @Date 2023/9/19 22:53
 * @Version 1.0
 */
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int res = 0;
        int size = moves.length();
        for (int i = 0; i < size; i++) {
            switch (moves.charAt(i)) {
                case 'L': {
                    left++;
                    break;
                }
                case 'R': {
                    right++;
                    break;
                }
            }
        }
        if (left - right < 0) {
            return size- left  - left ;
        } else {
            return size - right - right;
        }

    }
}

public class LeetCode2833 {
}
