package CodeTop.HW.HW1160;

/**
 * @ClassName HW1160
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 16:22
 * @Version 1.0
 */
class Solution {
    private int[] cclist = new int[26];

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (Character cc : chars.toCharArray()) {
            cclist[cc - 'a']++;
        }
        for (String ss : words) {
            if (can(ss)) {
                count+=ss.length();
            }
        }

        return count;

    }

    private boolean can(String ss) {
        int[] temp = new int[26];
        for (Character cc : ss.toCharArray()) {
            temp[cc - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] > cclist[i]) {
                return false;
            }
        }
        return true;
    }
}

public class HW1160 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countCharacters(new String[]{
                "cat", "bt", "hat", "tree"
        }, "atach"));
        System.out.println(solution.countCharacters(new String[]{
                "hello", "world", "leetcode"
        }, "welldonehoneyr"));
    }
}
