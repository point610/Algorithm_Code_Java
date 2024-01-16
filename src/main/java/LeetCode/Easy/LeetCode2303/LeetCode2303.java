package LeetCode.Easy.LeetCode2303;

/**
 * @ClassName LeetCode2303
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 11:30
 * @Version 1.0
 */
class Solution {
    public double calculateTax(int[][] brackets, int income) {

        double res = 0;
        int size = brackets.length;
        for (int i = 0; i < size; i++) {

            if (i == 0) {
                if (income < brackets[i][0]) {
                    res += income * brackets[i][1];
                    break;
                } else {
                    res += brackets[i][0] * brackets[i][1];
                }

            } else {
                if (income < brackets[i][0]) {
                    res += (income - brackets[i - 1][0]) * brackets[i][1];
                    break;
                } else {
                    res += (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1];
                }

            }
        }
        return res*0.01;
    }
}

public class LeetCode2303 {
    public static void main(String[] args) {

    }
}
