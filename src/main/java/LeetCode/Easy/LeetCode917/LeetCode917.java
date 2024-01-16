package LeetCode.Easy.LeetCode917;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode917
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 23:28
 * @Version 1.0
 */
class Solution {
    public String reverseOnlyLetters(String s) {
        List<Integer> indexs = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!isABC(s.charAt(i))) {
                indexs.add(i);
            } else {
                res.insert(0, s.charAt(i));
            }
        }
        // 往res中插入数据
        int listSize = indexs.size();
        for (int i = 0; i < listSize; i++) {
            int index = indexs.get(i);
            res.insert(index, s.charAt(indexs.get(i)));
        }

        return String.valueOf(res);
    }

    boolean isABC(char temp) {
        return 'a' <= temp && temp <= 'z' || 'A' <= temp && temp <= 'Z';
    }
}

public class LeetCode917 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
