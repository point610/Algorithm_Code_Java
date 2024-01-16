package LeetCode.Easy.LeetCode1967;

/**
 * @ClassName LeetCode1967
 * @Description TODO
 * @Author point
 * @Date 2023/9/29 19:37
 * @Version 1.0
 */
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int sum = 0;
        int size = patterns.length;
        for (int i = 0; i < size; i++) {
            if (word.contains(patterns[i])){
                sum++;
            }
        }return sum;
    }
}

public class LeetCode1967 {
}
