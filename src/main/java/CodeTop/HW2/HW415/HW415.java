package CodeTop.HW2.HW415;


class Solution {
    public String addStrings(String num1, String num2) {
        int onesize = num1.length();
        int twosize = num2.length();

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        int oneindex = 0;
        int twoindex = 0;

        StringBuilder stringBuilder = new StringBuilder();
        int upper = 0;

        while (oneindex < onesize && twoindex < twosize) {
            int temp = upper + (num1.charAt(oneindex) - '0') + (num2.charAt(twoindex) - '0');
            upper = temp / 10;
            int current = temp % 10;

            stringBuilder.append(current);
            oneindex++;
            twoindex++;
        }

        while (oneindex < onesize) {
            int temp = upper + (num1.charAt(oneindex) - '0');
            upper = temp / 10;
            int current = temp % 10;

            stringBuilder.append(current);
            oneindex++;
        }

        while (twoindex < twosize) {
            int temp = upper + (num2.charAt(twoindex) - '0');
            upper = temp / 10;
            int current = temp % 10;

            stringBuilder.append(current);
            twoindex++;
        }

        if (upper != 0) {
            stringBuilder.append(upper);
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
