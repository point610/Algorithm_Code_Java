package CodeTop.HW.HW679;


import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final double TARGET = 24;
    // double的比较大小不能直接使用==，要判断其小于一个较小的数值
    private static final double EPISLON = 1e-6;

    public boolean judgePoint24(int[] cards) {
        return helper(new double[]{cards[0], cards[1], cards[2], cards[3]});
    }

    private boolean helper(double[] nums) {
        // 只有一个数值的情况
        if (nums.length == 1) {
            return Math.abs(nums[0] - TARGET) < EPISLON;
        }

        // 每次选择两个不同的数进行回溯
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 将选择出来的两个数的计算结果和原数组剩下的数加入 next 数组
                double[] next = new double[nums.length - 1];
                for (int k = 0, pos = 0; k < nums.length; k++) {
                    // 加入next中不参与当前运算的数值
                    if (k != i && k != j) {
                        next[pos++] = nums[k];
                    }
                }
                // 将参与运算的数值计算的结果加入next剩下的位置中，进行递归
                for (double num : calculate(nums[i], nums[j])) {
                    next[next.length - 1] = num;
                    // 递归调用helper
                    if (helper(next)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // 计算的各种情况
    private List<Double> calculate(double a, double b) {
        List<Double> list = new ArrayList<>();
        list.add(a + b);
        list.add(a - b);
        list.add(b - a);
        list.add(a * b);
        // 不在double中过小的数值
        if (!(Math.abs(b) < EPISLON)) {
            list.add(a / b);
        }
        // 不在double中过小的数值
        if (!(Math.abs(a) < EPISLON)) {
            list.add(b / a);
        }
        return list;
    }
}

public class HW679 {
}
