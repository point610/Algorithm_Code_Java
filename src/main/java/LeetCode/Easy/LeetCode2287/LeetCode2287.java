package LeetCode.Easy.LeetCode2287;

/**
 * @ClassName LeetCode2287
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 17:46
 * @Version 1.0
 */
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] list = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            list[s.charAt(i) - 'a']++;
        }
        int[] temp = new int[26];
        size = target.length();
        for (int i = 0; i < size; i++) {
            temp[target.charAt(i) - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (temp[i] != 0) {
                if (list[i] == 0) {
                    return 0;
                }
                min = Math.min(min, list[i] / temp[i]);

            }
        }
        return min;
    }
}

public class LeetCode2287 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }
}
