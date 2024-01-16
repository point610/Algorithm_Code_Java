package LeetCode.Easy.MS.MS0507;

/**
 * @ClassName MS0507
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 11:39
 * @Version 1.0
 */
class Solution {
    public int exchangeBits(int num) {

        int maskone = 2;
        int masktwo = 1;
        for (int i = 0; i < 16; i++) {
            maskone <<= 2;
            maskone += 2;
            masktwo <<= 2;
            masktwo += 1;
        }
        int one = num & maskone;
        int two = num & masktwo;
        return (one >> 1) + (two << 1);


    }
}

public class MS0507 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.exchangeBits(3));
    }
}
