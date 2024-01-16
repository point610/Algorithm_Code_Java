package LeetCode.Easy.LeetCode1189;

/**
 * @ClassName LeetCode1189
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 23:25
 * @Version 1.0
 */
class Solution {

    public int maxNumberOfBalloons(String text) {
        int[] list = new int[26];
        int size = text.length();
        for (int i = 0; i < size; i++) {
            list[text.charAt(i) - 'a']++;
        }
        // 开始计数
        int res = 10000;
        res = Math.min(res, list[1]);
        res = Math.min(res, list[0]);
        res = Math.min(res, list[13]);
        res = Math.min(res, list[11] / 2);
        res = Math.min(res, list[14] / 2);

        return res;
    }
}

public class LeetCode1189 {

}
