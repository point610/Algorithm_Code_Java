package LeetCode.Easy.LeetCode383;

/**
 * @ClassName LeetCode383
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 22:05
 * @Version 1.0
 */
class Solution {
    int[] one = new int[26];
    int[] two = new int[26];

    public boolean canConstruct(String ransomNote, String magazine) {
        int size = ransomNote.length();
        for (int i = 0; i < size; i++) {
            one[ransomNote.charAt(i) - 'a']++;
        }
        size = magazine.length();
        for (int i = 0; i < size; i++) {
            two[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (one[i] > two[i]) {
                return false;
            }

        }
        return true;
    }
}

public class LeetCode383 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa", "aab"));
    }
}
