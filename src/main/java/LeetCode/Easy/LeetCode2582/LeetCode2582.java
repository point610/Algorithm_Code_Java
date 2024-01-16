package LeetCode.Easy.LeetCode2582;

/**
 * @ClassName LeetCode2582
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 10:49
 * @Version 1.0
 */
class Solution {
    public int passThePillow(int n, int time) {
        if (n > time) {
            return time + 1;
        }
        time++;
        int index = 0;
        boolean right = true;
        while (time != 0) {
            if (right) {
                if (index == n) {
                    right = false;
                    index--;
                } else {
                    index++;
                }
            } else {
                if (index == 1) {
                    right = true;
                    index++;
                } else {
                    index--;
                }
            }
            time--;
        }
        return index;
    }
}

public class LeetCode2582 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.passThePillow(18, 38));
    }
}
