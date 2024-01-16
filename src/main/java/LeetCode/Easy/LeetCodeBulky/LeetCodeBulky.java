package LeetCode.Easy.LeetCodeBulky;

/**
 * @ClassName LeetCodeBulky
 * @Description TODO
 * @Author point
 * @Date 2023/10/3 11:01
 * @Version 1.0
 */
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulky = false;
        boolean Heavy = false;
        if (length >= 10000 || width >= 10000 || height >= 10000 || ((long)length * width * height) >= 1000000000l) {
            Bulky = true;
        }
        //如果箱子的质量大于等于 100 ，那么箱子是 "Heavy" 的。
        if (mass >= 100) {
            Heavy = true;
        }
        // 如果箱子同时是 "Bulky" 和 "Heavy" ，那么返回类别为 "Both" 。
        if (Bulky && Heavy) {
            return "Both";
        }
        // 如果箱子既不是 "Bulky" ，也不是 "Heavy" ，那么返回类别为 "Neither" 。
        if (!Bulky && !Heavy) {
            return "Neither";
        }
        // 如果箱子是 "Bulky" 但不是 "Heavy" ，那么返回类别为 "Bulky" 。
        if (Bulky && !Heavy) {
            return "Bulky";
        }
        // 如果箱子是 "Heavy" 但不是 "Bulky" ，那么返回类别为 "Heavy" 。
        if (!Bulky && Heavy) {
            return "Heavy";
        }
        return "";
    }
}

public class LeetCodeBulky {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.categorizeBox(2909
                ,
                3968
                ,
                3272
                ,
                727);
    }
}
