package LeetCode.Easy.LeetCode2224;

/**
 * @ClassName LeetCode2224
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 12:43
 * @Version 1.0
 */
class Solution {
    int subhour(int one, int two) {
        return Math.abs(one - two);
    }

    int gethour(String one) {
        return Integer.parseInt(one.substring(0, 2));
    }

    int getmin(String one) {
        return Integer.parseInt(one.substring(3));
    }

    int getsubmin(int step) {
        int shiwu = step / 15;
        step = step % 15;
        int wu = step / 5;
        step = step % 5;
        int yi = step;
        return shiwu + wu + yi;
    }

    public int convertTime(String current, String correct) {
        int sum = subhour(gethour(current), gethour(correct));
        int onemin = getmin(current);
        int twomin = getmin(correct);

        if (onemin <= twomin) {
            int step = twomin - onemin;
            sum = sum + getsubmin(step);

        } else {
            sum--;
            int step = twomin + 60 - onemin;
            sum = sum + getsubmin(step);


        }
        return sum;

    }
}

public class LeetCode2224 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertTime("02:30", "04:35"));
    }
}
