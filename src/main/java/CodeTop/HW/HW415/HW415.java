package CodeTop.HW.HW415;


/**
 * @ClassName HW415
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 15:54
 * @Version 1.0
 */
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder one = new StringBuilder(num1).reverse();
        StringBuilder two = new StringBuilder(num2).reverse();
        StringBuilder stringBuilder = new StringBuilder();

        int temp = 0;
        int oneindex = 0;
        int twoindex = 0;
        while (oneindex < one.length() && twoindex < two.length()) {
            int oo = one.charAt(oneindex) - '0';
            int tt = two.charAt(twoindex) - '0';

            int now = oo + tt + temp;
            int current = now % 10;
            temp = now / 10;

            stringBuilder.append(current);

            oneindex++;
            twoindex++;
        }
        while (oneindex < one.length()) {
            int oo = one.charAt(oneindex) - '0';

            int now = oo + temp;
            int current = now % 10;
            temp = now / 10;

            stringBuilder.append(current);

            oneindex++;
        }
        while (twoindex < two.length()) {
            int tt = two.charAt(twoindex) - '0';

            int now = tt + temp;
            int current = now % 10;
            temp = now / 10;

            stringBuilder.append(current);

            twoindex++;
        }
        if (temp != 0) {
            stringBuilder.append(temp);
        }

        return stringBuilder.reverse().toString();

    }
}

public class HW415 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("11", "123"));
        System.out.println(solution.addStrings("456", "77"));
        System.out.println(solution.addStrings("0", "0"));
        System.out.println(solution.addStrings("1", "9"));
    }
}
