package LeetCode.Easy.LeetCode2591;

/**
 * @ClassName LeetCode2591
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 10:35
 * @Version 1.0
 */
class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        money -= children;

        int res = money / 7;
        if (res >= children) {
            if (money - children * 7 == 0) {
                return children;
            }
            return children - 1;
        }
        if (money % 7 == 3 && res > 0 && (children - res) == 1) {
            res--;
        }


        return res;
    }
}

public class LeetCode2591 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distMoney(16,2));

    }
}
