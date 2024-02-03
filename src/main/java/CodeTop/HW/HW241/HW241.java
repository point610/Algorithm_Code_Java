package CodeTop.HW.HW241;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private char[] cc;

    private List<Integer> DFS(int left, int right) {
        List<Integer> aaaa = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if ('0' <= cc[i] && cc[i] <= '9') {
                continue;
            }

            // 为符号
            List<Integer> lll = DFS(left, i - 1);
            List<Integer> rrr = DFS(i + 1, right);

            for (Integer one : lll) {
                for (Integer two : rrr) {
                    int temp = 0;
                    char sign = cc[i];
                    switch (sign) {
                        case '+': {
                            temp = one + two;
                            break;
                        }
                        case '-': {
                            temp = one - two;
                            break;
                        }
                        case '*': {
                            temp = one * two;
                            break;
                        }
                    }
                    // 不用去重？
                    aaaa.add(temp);
                }
            }
        }
        if (aaaa.isEmpty()) {
            // 只存在数字
            int temp = 0;
            for (int i = left; i <= right; i++) {
                temp = temp * 10 + (cc[i] - '0');
            }
            aaaa.add(temp);
        }
        return aaaa;
    }

    public List<Integer> diffWaysToCompute(String expression) {
        cc = expression.toCharArray();
        return DFS(0, expression.length() - 1);
    }
}

public class HW241 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.diffWaysToCompute("2-1-1"));
        System.out.println(solution.diffWaysToCompute("2*3-4*5"));
    }
}
