package LeetCode.Easy.LeetCode1417;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName LeetCode1417
 * @Description TODO
 * @Author point
 * @Date 2023/9/26 23:58
 * @Version 1.0
 */
class Solution {
    public String reformat(String s) {
        Queue<Character> shuzhi = new LinkedList<>();
        Queue<Character> zimu = new LinkedList<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                shuzhi.add(s.charAt(i));
            } else {
                zimu.add(s.charAt(i));
            }
        }
        if (Math.abs(shuzhi.size() - zimu.size())>1){
            return "";
        }
            StringBuilder stringBuilder = new StringBuilder();

        if (shuzhi.size() == zimu.size()) {
            while (!zimu.isEmpty() && !shuzhi.isEmpty()) {
                stringBuilder.append(zimu.poll());
                stringBuilder.append(shuzhi.poll());
            }
        } else if (shuzhi.size() < zimu.size()) {
            stringBuilder.append(zimu.poll());
            while (!zimu.isEmpty() && !shuzhi.isEmpty()) {
                stringBuilder.append(shuzhi.poll());
                stringBuilder.append(zimu.poll());
            }
        } else if (shuzhi.size() > zimu.size()) {
            stringBuilder.append(shuzhi.poll());
            while (!zimu.isEmpty() && !shuzhi.isEmpty()) {
                stringBuilder.append(zimu.poll());
                stringBuilder.append(shuzhi.poll());
            }
        }
        return stringBuilder.toString();

    }
}

public class LeetCode1417 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reformat("leetcode"));
    }
}
