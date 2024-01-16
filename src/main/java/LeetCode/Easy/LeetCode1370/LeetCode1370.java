package LeetCode.Easy.LeetCode1370;

/**
 * @ClassName LeetCode1370
 * @Description TODO
 * @Author point
 * @Date 2023/9/18 21:44
 * @Version 1.0
 */
class Solution {
    public String sortString(String s) {
        int[] ns = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            ns[s.charAt(i) - 'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int sign = 0;
        while (sign != size) {
            for (int i = 0; i < 26; i++) {
                if (ns[i] != 0) {
                    stringBuilder.append((char) (i + 'a'));
                    ns[i]--;
                    sign++;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (ns[i] != 0) {
                    stringBuilder.append((char) (i + 'a'));
                    ns[i]--;
                    sign++;
                }
            }

        }
        return stringBuilder.toString();
    }
}

public class LeetCode1370 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortString("aaaabbbbcccc"));
    }
}
