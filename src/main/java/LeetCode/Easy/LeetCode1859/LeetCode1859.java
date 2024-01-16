package LeetCode.Easy.LeetCode1859;

/**
 * @ClassName LeetCode1859
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 0:57
 * @Version 1.0
 */
class Solution {
    public String sortSentence(String s) {
        String[] strings = s.split(" ");
        int size = strings.length;
        String[] list = new String[size];

        for (int i = 0; i < size; i++) {
            int index = strings[i].charAt(strings[i].length() - 1) - '0';
            list[index-1] = strings[i].substring(0, strings[i].length() - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(list[i]);
            if (i != size - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();

    }
}

public class LeetCode1859 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sortSentence("is2 sentence4 This1 a3"));
    }
}
