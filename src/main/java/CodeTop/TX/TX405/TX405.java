package CodeTop.TX.TX405;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (num != 0) {
            int temp = num & 15;
            char cc;
            if (temp < 10) {
                cc = (char) (temp + '0');
            } else {
                cc = (char) ((temp - 10) + 'a');
            }
            stringBuilder.append(cc);
            // 使用无符号右移，使得最后的num为0
            num>>>=4;
        }

        return stringBuilder.reverse().toString();
    }


}

public class TX405 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toHex(26));
        System.out.println(solution.toHex(-1));
    }
}
