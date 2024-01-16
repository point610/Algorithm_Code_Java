package LeetCode.Easy.LeetCode844;

import java.util.Stack;

/**
 * @ClassName LeetCode844
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 12:49
 * @Version 1.0
 */
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> one = new Stack<>();
        Stack<Character> two = new Stack<>();
        int sSize = s.length();
        int tSize = t.length();
        for (int i = 0; i < sSize; i++) {
            if (s.charAt(i) == '#' ) {
                if (!one.empty()){
                    one.pop();
                }
                continue;
            }
            one.push(s.charAt(i));
        }
        for (int i = 0; i < tSize; i++) {
            if (t.charAt(i) == '#') {
                if (!two.empty()){
                    two.pop();
                }
                continue;
            }
            two.push(t.charAt(i));
        }

        while (!one.empty() && !two.empty()) {
            if (one.peek() != two.peek()) {
                return false;
            }
            one.pop();
            two.pop();
        }
        return one.empty() && two.empty();
    }
}

public class LeetCode844 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}
