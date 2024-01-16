package LeetCode.Easy.LeetCode717;

/**
 * @ClassName LeetCode717
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 18:39
 * @Version 1.0
 */
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int size = bits.length;
        if (size == 1) {
            return true;
        } else if (size == 2) {
            return bits[0] == 0;
        }
        if (bits[size - 2] == 0) {
            return true;
        }

        int oneNumber = 0;
        for (int i = size - 2; i >= 0; i--) {
            if (bits[i] == 0) {
                break;
            }
            oneNumber++;
        }
        return oneNumber % 2 == 0;
    }
}

public class LeetCode717 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isOneBitCharacter(new int[]{1, 0, 0});
    }
}
