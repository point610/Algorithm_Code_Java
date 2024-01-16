package LeetCode.Easy.LeetCode2000;

/**
 * @ClassName LeetCode2000
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 1:07
 * @Version 1.0
 */
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        StringBuilder stringBuilder = new StringBuilder(word.substring(0, index + 1));
        stringBuilder.reverse();
        stringBuilder.append(word.substring(index+1));
        return stringBuilder.toString();

    }
}

public class LeetCode2000 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reversePrefix("abcdefd", 'd'));
    }
}
