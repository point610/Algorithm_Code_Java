package LeetCode.Easy.LeetCode1103;

/**
 * @ClassName LeetCode1103
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:32
 * @Version 1.0
 */
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int index = 0;
        int temp = 1;
        while (true) {
            if (temp > candies) {
                res[index] += candies;
                break;
            }
            res[index] += temp;
            candies -= temp;
            temp++;
            index = (index + 1) % num_people;
        }
        return res;
    }

}

public class LeetCode1103 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.distributeCandies(7, 4);
    }
}
