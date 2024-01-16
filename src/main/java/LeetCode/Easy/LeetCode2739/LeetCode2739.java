package LeetCode.Easy.LeetCode2739;

/**
 * @ClassName LeetCode2739
 * @Description TODO
 * @Author point
 * @Date 2023/10/4 12:56
 * @Version 1.0
 */
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int sum = 0;
        while (mainTank != 0) {
            if (mainTank < 5) {
                sum += mainTank * 10;
                break;
            }

            int shang = mainTank / 5;
            int yushu = mainTank % 5;
            sum += shang * 50;
            if (additionalTank >= shang) {
                mainTank = yushu + shang;
                additionalTank -= shang;

            } else {
                mainTank = yushu + additionalTank;
                sum += mainTank * 10;
                break;
            }

        }
        return sum;
    }
}

public class LeetCode2739 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distanceTraveled(9, 1));
    }
}
