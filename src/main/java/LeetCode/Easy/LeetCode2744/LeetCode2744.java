package LeetCode.Easy.LeetCode2744;

/**
 * @ClassName LeetCode2744
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 13:03
 * @Version 1.0
 */
class Solution {
    boolean issame(String one, String two) {
        return one.charAt(0) == two.charAt(1) && one.charAt(1) == two.charAt(0);
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int size = words.length;
        int sum = 0;
        boolean[] done = new boolean[size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (issame(words[i], words[j]) && !done[i] && !done[j]) {
                    sum++;
                    done[i] = true;
                    done[j] = true;
                }
            }
        }
        return sum;
    }
}

public class LeetCode2744 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumNumberOfStringPairs(new String[]{"aa", "ab"}));
    }
}
